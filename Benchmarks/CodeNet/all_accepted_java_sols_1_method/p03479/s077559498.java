import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		sc.close();
		long t = X;
		int cnt = 0;
		while(t <= Y) {
			t *= 2;
			cnt++;
		}
		System.out.println(cnt);
	}
}