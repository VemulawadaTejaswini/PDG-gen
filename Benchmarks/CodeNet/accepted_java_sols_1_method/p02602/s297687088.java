import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n + 1];
		for(int i = 1 ; i <= n ; i++) {
			a[i] = sc.nextLong();
		}
		String s = "";
		StringBuilder sb = new StringBuilder(s);
		for(int i = k + 1 ; i <= n ; i++) {
			if(a[i - k] >= a[i]) {
				sb.append("No\n");
			}
			else
				sb.append("Yes\n");
		}

		sc.close();
		System.out.println(sb.toString());

	}
}

