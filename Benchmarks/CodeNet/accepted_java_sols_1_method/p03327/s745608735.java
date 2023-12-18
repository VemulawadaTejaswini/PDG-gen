import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int intNum = sc.nextInt();


		if(1000 <= intNum) {
			System.out.println("ABD");
		}
		else {
			System.out.println("ABC");
		}

	}
}
