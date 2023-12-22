import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M_1 = sc.nextInt();
		int D_1 = sc.nextInt();
		int M_2 = sc.nextInt();
		int D_2 = sc.nextInt();

		if (M_1 != M_2) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}
}