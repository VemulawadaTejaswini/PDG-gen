import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cn = 0;
		for (; sc.nextLine() == "";) {
			Integer.parseInt(sc.nextLine());
			cn++;
		}

		int j = 0;
		
		int[] in = new int[cn];

		for (int number = 1;; number++) {
			if (in[j] == 0) {
				break;
			} else {
				System.out.print("Case ");
				System.out.print(number);
				System.out.print(": ");
				System.out.println(in[j]);
				j++;
			}
		}
	}

}