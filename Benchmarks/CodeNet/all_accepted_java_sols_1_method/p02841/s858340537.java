import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int M1 = in.nextInt();
		int D1 = in.nextInt();
		int M2 = in.nextInt();
		int D2 = in.nextInt();
		System.out.println(M1 + 1 == M2 ? 1 : 0);
		in.close();
	}
}