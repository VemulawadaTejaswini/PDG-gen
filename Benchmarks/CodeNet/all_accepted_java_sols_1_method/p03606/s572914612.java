import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int result = 0;
		for (int i = 0; i < N; i++) {
			int li = sc.nextInt();
			int ri = sc.nextInt();
			result += (ri - li + 1);
		}
		sc.close();
		System.out.println(result);
	}
}