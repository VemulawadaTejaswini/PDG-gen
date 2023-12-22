import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int l = c.length-1;
		long ans = 0L;
		for(int i = 0; i < (1<<l); i++) {
			StringBuilder sb =new StringBuilder();
			for(int j = l-1, k = 0; j >= 0; j--, k++) {
				sb.append(c[k]);
				if(((i>>j) & 1) == 1) {
					sb.append('+');
				}
			}
			sb.append(c[l]);
			String[] arr = sb.toString().split("\\+");
			for(int j = 0; j < arr.length; j++) {
				ans += Long.valueOf(arr[j]);
			}
		}
		System.out.println(ans);
	}
}