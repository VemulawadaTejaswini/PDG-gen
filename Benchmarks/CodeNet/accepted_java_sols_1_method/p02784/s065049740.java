import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += sc.nextInt();
		}
		if (sum >= H) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
