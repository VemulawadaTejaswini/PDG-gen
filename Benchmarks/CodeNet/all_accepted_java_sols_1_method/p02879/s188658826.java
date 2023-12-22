import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	//C問題

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);

		int a, b;

		a = scan.nextInt();
		b = scan.nextInt();

		if (a > 9 || b > 9) {
			System.out.println(-1);
		} else {
			System.out.println(a * b);
		}
	}

}
