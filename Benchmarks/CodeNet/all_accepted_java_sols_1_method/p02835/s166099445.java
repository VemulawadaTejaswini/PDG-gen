import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A1 = scan.nextInt();
		int A2 = scan.nextInt();
		int A3 = scan.nextInt();

		System.out.println(A1+A2+A3 >= 22?"bust":"win");

		scan.close();

	}

}
