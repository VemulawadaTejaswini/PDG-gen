
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			String[] S = new String[N];
			Map<String, Integer> map = new HashMap<String,Integer>();
			map.put("AC", 0);
			map.put("WA", 0);
			map.put("TLE", 0);
			map.put("RE", 0);
			for(int i = 0;i<N;i++) {
				S[i]= scan.next();
				map.put(S[i], map.get(S[i])+1);
			}
			
			
			System.out.println("AC x "+map.get("AC"));
			System.out.println("WA x "+map.get("WA"));
			System.out.println("TLE x "+map.get("TLE"));
			System.out.println("RE x "+map.get("RE"));

		}	
	}
}
