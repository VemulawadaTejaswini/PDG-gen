
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ans = new ArrayList<String>();
		Map <String, Integer> hm = new HashMap<String,Integer>();
		
		int n = Integer.parseInt(sc.next());
		
		for(int i = 0; i < n ;i++) {
			String s = sc.next();
			if(!hm.containsKey(s)) {
				hm.put(s, 1);
			}
			else {
				hm.put(s,hm.get(s)+1);
			}
		}
		
		int max = 0; 
		for(String s : hm.keySet()) {
			max = Math.max(max,hm.get(s));
		}
		int num = 0;
		for(String s : hm.keySet()) {
			if(max == hm.get(s)) {
				ans.add(s);
				num++;
			}
		}
		Collections.sort(ans);
		
		for(int i = 0 ;i < num ;i++) {
			System.out.println(ans.get(i));
		}
	}
}
