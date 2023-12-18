import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		String[] d = new String[k];
		for (int i = 0; i < k; i++) {
			d[i] = scan.next();
		}
		int ans = 0;
		for (int i = n; i <= Integer.MAX_VALUE; i++) {
			String i_str = String.valueOf(i);
			boolean f = false;
			for (int j = 0; j < k; j++) {
				if (i_str.contains(d[j])) {
					f = true;
				}
			}
			if (f == false) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}
