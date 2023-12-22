import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int a = n.charAt(0) - '0';
		int b = n.charAt(1) - '0';
		int c = n.charAt(2) - '0';
		int d = n.charAt(3) - '0';
		int[] v = new int[]{1, -1};
		String[] op = new String[]{"+", "-"};
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				for (int k = 0; k < v.length; k++) {
					if (a + b * v[i] + c * v[j] + d * v[k] == 7) {
						StringBuilder sb = new StringBuilder();
						sb.append(a).append(op[i]).append(b).append(op[j]).append(c).append(op[k]).append(d).append("=7");
						System.out.println(sb);
						return;
					}
				}
			}
		}
	}
}
