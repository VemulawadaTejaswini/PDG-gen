import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		
		int r = s*t - d;

		System.out.println( r>=0 ? "Yes": "No");
	}
}
