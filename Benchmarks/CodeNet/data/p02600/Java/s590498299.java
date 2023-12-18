import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int rank = (N - 400) / 200;
			System.out.print(8 - rank);
		}
	}
}