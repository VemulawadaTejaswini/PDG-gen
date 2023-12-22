import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値(N)
		int numN = scan.nextInt();

		System.out.println(numN * numN * numN);
	}
}