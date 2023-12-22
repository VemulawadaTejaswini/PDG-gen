import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long d = sc.nextInt();
		d = d * d;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			long x = sc.nextInt();
			long y = sc.nextInt();
			if (d >= x * x + y * y)
				cnt++;
		}
		System.out.println(cnt);
	}
}
