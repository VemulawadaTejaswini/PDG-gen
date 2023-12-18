import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long N = sc.nextLong();
			System.out.println(N * (N - 1) / 2);
		}
	}
}
