import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		caseL:
		while(true){
			int N = Integer.parseInt(br.readLine());
			if(N==0)
				break;
			String[] l = br.readLine().split(" ");
			HashMap<String, Integer> map = new HashMap<>();
			for(String s:l){
				if(map.containsKey(s))
					map.put(s, map.get(s)+1);
				else
					map.put(s, 1);
			}
			int max = Integer.MIN_VALUE;
			for(String s:l){
				max = Math.max(max, map.get(s));
				if(max>l.length/2){
					System.out.println(s);
					continue caseL;
				}
			}
			System.out.println("NO COLOR");
		}
	}
}