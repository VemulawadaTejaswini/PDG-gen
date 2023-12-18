import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		if (N % 1000 == 0) {
			System.out.println(0);
		} else {
			int cnt = N / 1000 + 1;
			System.out.println((1000 * cnt) - N);
		}
	}
}
