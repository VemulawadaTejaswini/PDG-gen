import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		int plus = A+B;
		int minus = A-B;
		int times = A*B;
		int ans = Math.max(plus,Math.max(minus, times));

		System.out.println(ans);

	}
}