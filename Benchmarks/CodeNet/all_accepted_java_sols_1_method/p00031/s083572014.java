import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			for (int i = 0 ; i < 10 ; i++) {
				if ((n & (int) Math.pow(2, i)) != 0) sb.append((int) Math.pow(2, i)).append(" ");

			}
			System.out.println(sb.deleteCharAt(sb.length()-1));
		}

	}
}