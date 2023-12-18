import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		List<Integer> nk = Arrays.stream(br.readLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		int n = nk.get(0);
		int k = nk.get(1);
		
		List<Integer> ws = new ArrayList<>();
		for(int i = 0; i < n; i++){
			ws.add(Integer.parseInt(br.readLine()));
		}
		
		int p = -1;
		boolean result = false;
		while(p < 10000 * 100000 && !result){
			p++;
			result = check(p, k, ws);
		}
		System.out.println(p);
		
	}
	
	static boolean check(int p, int k, List<Integer> ws){
		int truck = 0;
		int t = 1;
		boolean result = true;
		
		for(int i = 0; i < ws.size(); i++){
			if(truck + ws.get(i) <= p){
				truck += ws.get(i);
			}else{
				t++;
				if(k < t){
					result = false;
					break;
				}else{
					truck = ws.get(i);
					if(p < truck){
						result = false;
						break;
					}
				}
			}
			
		}
		
		return result;
	}
}
