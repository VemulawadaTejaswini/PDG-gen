import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int choco = X;
		while (sc.hasNextInt()) {
			int A = sc.nextInt();
			choco += (D % A == 0) ? D / A : (D / A) + 1;
		}
		System.out.println(choco);
	}
}