import java.util.*;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static int N;
	public static ArrayList<String>  strs;
	public static String sol;
	
	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0)
				break;
			
			sol = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
			strs = new ArrayList<String>();
			for (int i = 0; i < N; i++)
				strs.add(sc.next());
			
			boolean[] used = new boolean[N];
			Arrays.fill(used, false);
			
			rec("", 0, used);
						
			/*
			for (int i = 0; i < ss.size(); i++) {
				System.out.println(ss.get(i));
			}
			*/
			
			System.out.println(sol);
			
		}
	}
	
	public static void rec(String str, int n, boolean[] used) {
		
		if (n == N) {
			sol = getMin(sol, str);
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (!used[i]) {
				used[i] = true;
				String res  = merge(str, strs.get(i));
				
				rec(res, n + 1, used);
				

				used[i] = false;
			}
		}
	}
	
	public static String merge(String s1, String s2) {
		
		if (s1.indexOf(s2) != -1) {
			return s1;
		} else if (s2.indexOf(s1) != -1) {
			return s2;
		}
		
		int len = s1.length();
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(0)) {
				boolean ok = true;
				int len2 = Math.min(s1.length() - i, s2.length());
				for (int j = 0; j < len2; j++) {
					if (s1.charAt(i + j) != s2.charAt(j)) {
						ok = false;
						break;
					}
				}
				
				if (ok) {
					len = i;
					break;
				}
			}
		}


		return s1.substring(0, len) + s2;
	}
	
	public static String getMin(String s1, String s2) {
		if (s1.length() == s2.length()) {
			if (s1.compareTo(s2) < 0) {
				return s1;
			} else {
				return s2;
			} 
		} else {
			if (s1.length() < s2.length()) {
				return s1;
			} else {
				return s2;
			}
		}
	}
}