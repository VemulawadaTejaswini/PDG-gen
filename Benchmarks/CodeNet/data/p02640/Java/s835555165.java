import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int animal = sc.nextInt();
		int legs = sc.nextInt();
		if (legs > animal * 4) {
			System.out.println("No");
		} else {

			if (legs % 2 % 4 == 0) {
				System.out.println("Yes");
			} else if (legs % 4 % 2 == 0) {
				System.out.println("Yes");
			} else if (legs % 4 == 0) {
				System.out.println("Yes");
			} else if (legs % 2 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
