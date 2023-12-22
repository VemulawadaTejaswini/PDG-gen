import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();
		int R = sc.nextInt();
		int d = sc.nextInt();

		System.out.println(R/d - (L-1)/d);
	}

}
