import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		for(int i = 0; i < n; i++)
			str[i] = sc.next();
		
		int q = sc.nextInt();
		long sum[] = new long[q];
		for(int i = 0; i < q; i++) {
			String s1 = sc.next();
			String s2 = sc.next();
			for(int k = 0; k < n; k++) {
				if(s1.equals(str[k]))
					str[k] = s2;
			}
			for(int j = 0; j < n; j++)
				sum[i] += Long.valueOf(str[j]);
		}
		for(int i = 0; i < q; i++)
			System.out.println(sum[i]);
	}
}
