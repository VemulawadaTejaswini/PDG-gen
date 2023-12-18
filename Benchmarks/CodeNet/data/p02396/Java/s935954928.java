import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		for (int number = 1;; number++) {
			Scanner sc = new Scanner(System.in);
			int kari = Integer.parseInt(sc.nextLine());
			if (kari == 0) {
				break;
			} else {
				System.out.print("Case ");
				System.out.print(number);
				System.out.print(": ");
				System.out.println(kari);
			}
		}
	}

}