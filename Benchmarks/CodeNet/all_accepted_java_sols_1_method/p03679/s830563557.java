import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a >= b){
			System.out.println("delicious");
		}else if (a + x >= b) {
			System.out.println("safe");
		}else {
			System.out.println("dangerous");
		}
	}
}
