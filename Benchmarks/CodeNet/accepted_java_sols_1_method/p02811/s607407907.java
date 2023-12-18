import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int mai = scan.nextInt();
		int sum = scan.nextInt();

		System.out.println(mai*500>=sum?"Yes":"No");

		scan.close();

	}

}
