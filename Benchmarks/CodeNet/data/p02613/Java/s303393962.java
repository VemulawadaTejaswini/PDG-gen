import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		Map<String,Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			String s = stdIn.next();
			if(map.containsKey(s)) {
				map.put(s,map.get(s)+1);
			}else {
				map.put(s,1);
			}
		}
		
		boolean flag = true;
		for(String s: map.keySet()) {
			if(s.equals("AC")) {
				flag = false;
				System.out.println("AC x "+map.get(s));
			}
		}
		if(flag) {
			System.out.println("AC x "+0);
		}
		
		flag = true;
		
		for(String s: map.keySet()) {
			if(s.equals("WA")) {
				flag = false;
				System.out.println("WA x "+map.get(s));
			}
		}
		if(flag) {
			System.out.println("WA x "+0);
		}
		
		flag = true;
		
		for(String s: map.keySet()) {
			if(s.equals("TLE")) {
				flag = false;
				System.out.println("TLE x "+map.get(s));
			}
		}
		
		if(flag) {
			System.out.println("TLE x "+0);
		}
		
		flag = true;
		for(String s: map.keySet()) {
			if(s.equals("RE")) {
				flag = false;
				System.out.println("RE x "+map.get(s));
			}
		}
		if(flag) {
			System.out.println("RE x "+0);
		}
		
		
	}

}
