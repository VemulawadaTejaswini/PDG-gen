import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	//C問題

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);

		int a1,a2,a3;

		a1 = scan.nextInt();
		a2 = scan.nextInt();
		a3 = scan.nextInt();

		if ( a1 + a2 + a3 >= 22) {
			System.out.println("bust");
		}else {
			System.out.println("win");
		}
	}

}