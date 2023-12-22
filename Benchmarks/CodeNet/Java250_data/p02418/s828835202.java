import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		line1 += line1;
		String line2 = sc.nextLine();

		if(line1.indexOf(line2) >= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}