import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long d = sc.nextInt();
		
		long ans = Math.max(a*c, Math.max(a*d, Math.max(b*c, b*d)));
		System.out.println(ans);
		
		sc.close();
	}
}
