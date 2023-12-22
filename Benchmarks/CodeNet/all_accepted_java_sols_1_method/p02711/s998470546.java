import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		String N = scanner.next();

		for(int i=0;i<3;i++) {
			if(String.valueOf(N.charAt(i)).equals("7")) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");

	}

}
