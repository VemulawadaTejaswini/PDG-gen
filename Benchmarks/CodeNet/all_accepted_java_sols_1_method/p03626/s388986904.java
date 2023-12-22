import java.util.*;

public class Main {
	public static final long MOD = 1000000007;
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s1 = sc.next();
		String s2 = sc.next();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				list.add(0);
			} else {
				list.add(1);
				i++;
			}
		}
		long val = 1;
		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				if (list.get(i) == 0) {
					val *= 3;
				} else {
					val *= 6;
				}
			} else {
				if (list.get(i - 1) == 0 && list.get(i) == 0) {
					val *= 2;
				} else if (list.get(i - 1) == 0 && list.get(i) == 1) {
					val *= 2;
				} else if (list.get(i - 1) == 1 && list.get(i) == 0) {
					val *= 1;
				} else if (list.get(i - 1) == 1 && list.get(i) == 1) {
					val *= 3;
				}
			}
			val %= MOD;
		}
		System.out.println(val);
	}
}
