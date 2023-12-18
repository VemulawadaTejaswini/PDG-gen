
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		if(B - A <= 0) {
			System.out.println("delicious");
		} else {
			if(B - A > X) {
				System.out.println("dangerous");
			} else {
				System.out.println("safe");
			}
		}
		scan.close();
	}

}
