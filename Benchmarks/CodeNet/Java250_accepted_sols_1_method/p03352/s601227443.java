import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		boolean[] expo = new boolean[X + 1];
		expo[1] = true;
		for (int i = 2; i <= X; i++) {
			int v = i * i;
			while (v <= X) {
				expo[v] = true;
				v *= i;
			}
		}
		for (int i = X; i >= 1; i--) {
			if (expo[i]) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}