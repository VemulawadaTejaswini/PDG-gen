import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		long ans = 0;
		sc.close();
		if(m > 2 && n > 2)ans += (long)(n - 2) * (long)(m - 2);
		if(n <= 1 && m > 2)ans += (long)m - 2;
		if(n > 2 && m <= 1)ans += (long)n - 2;
		if(n == 1 && m == 1)ans = 1;
		System.out.println(ans);
	}

}
