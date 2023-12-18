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
		
		int p = 0;
		boolean result = false;
		while(p < 10000 * 100000 && !result){
			result = check(p, k, ws);
			p++;
		}
		
		System.out.println(p);
		
	}
	
	static boolean check(int p, int k, List<Integer> ws){
		int[] trucks = new int[k];
		int t = 0;
		boolean result = true;
		
		for(int w: ws){
			if(trucks[t] + w <= p){
				trucks[t] += w;
			}else{
				t++;
				if(k == t){
					result = false;
					break;
				}
			}
		}
		
		return result;
	}
}
