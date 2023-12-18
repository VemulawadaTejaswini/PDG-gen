import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A;
		int B;
		int i;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		sc.close();
		for (i = 0; i < 10001; i++) {
			if ((int) (i * 0.08) == A && (int) (i * 0.1) == B) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("-1");
	}

}