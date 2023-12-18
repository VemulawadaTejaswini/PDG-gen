import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = 9;
		char[] s = new char[n];
		for (int i = 0; i < n; i++) {
			s[i] = (char)('0' + sc.nextInt());
		}
		
		String ans = "123456780";
		int[] d = {-3, 3, -1, 1};
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		Queue<String> q = new ArrayDeque<String>();
		q.add(toString(s));
		hm.put(toString(s), 0);

		while (!q.isEmpty()) {
			String u = q.remove();
			if (u.equals(ans)) {
				System.out.println(hm.get(u));
				break;
			}
			
			StringBuffer str = new StringBuffer(u);
			int zero = str.indexOf("0");
			assert (zero != -1);
			for (int i = 0; i < d.length; i++) {
				if (zero + d[i] >= 0 && zero + d[i] < n && !(d[i] == -1 && (zero + d[i]) % 3 == 2) && !(d[i] == 1 && (zero + d[i]) % 3 == 0)) {
					str.setCharAt(zero, str.charAt(zero + d[i]));
					str.setCharAt(zero + d[i], '0');
					if (!hm.containsKey(str.toString())) {
						q.add(str.toString());
						hm.put(str.toString(), hm.get(u) + 1);
					}
					str.setCharAt(zero + d[i], str.charAt(zero));
					str.setCharAt(zero, '0');
				}
			}
		}

        sc.close();
	}
	
	private static String toString(char[] s) {
		String ret = "";
		for (int i = 0; i < s.length; i++) {
			ret += s[i];
		}
		
		return ret;
	}
}