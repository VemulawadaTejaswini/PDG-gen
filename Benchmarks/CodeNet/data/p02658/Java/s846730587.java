import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long total = 1;
		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();
			total = total * a;
				
		}
		if (total > 1000000000000000000L) {
			total = -1;
		}
		System.out.println(total);
	}
}