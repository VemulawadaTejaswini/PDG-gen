import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long banme = Long.MIN_VALUE;
		long ans = 0L;
		for(int i = 0; i < N; i++) {
			long l = sc.nextLong();
			long a = sc.nextLong();
			if(l >= banme) {
				banme = l;
				ans = l + a;
			}
		}
		System.out.println(ans);
	}
}