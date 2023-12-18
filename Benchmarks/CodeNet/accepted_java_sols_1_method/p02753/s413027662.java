import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();

		if((S.contains("A") == true) && (S.contains("B") == true))  {
			System.out.print("Yes");

		}else {
			System.out.print("No");

		}
	}

}
