import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Map<Character, HashSet<Integer>> s = new HashMap<Character, HashSet<Integer>>();
		char[] t = new char[n];
		
		String ss = sc.next();
		for(int i = 0; i < n; i++) {
			char tmp = ss.charAt(i);
			
			if(!s.containsKey(tmp)) {
				s.put(tmp, new HashSet<Integer>());
			}
			
			s.get(tmp).add(i);
		}
		
		String st = sc.next();
		for(int i = 0; i < n; i++) {
			t[i] = st.charAt(i);
		}
		
		int[] table = new int[n];
		for(int i = 0;i < n; i++) {
			table[i] = 0;
		}
		table[0] = 1;
		
		for(int i = 1; i < n; i++) {
			for(int x : s.get(t[i])) {
				if(x >= i) {
					break;
				}
				
				table[i] += table[x];
			}
		}
		
		System.out.println(table[n - 1]);
	}
}
