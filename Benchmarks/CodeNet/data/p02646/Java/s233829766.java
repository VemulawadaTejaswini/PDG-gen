import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int V = sc.nextInt();
		int B = sc.nextInt();
		int W = sc.nextInt();
		int T = sc.nextInt();

		int d = Math.abs(A - B);
		if ((V - W) * T >= d) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
