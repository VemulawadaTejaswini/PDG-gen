import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;

		sc = new Scanner(in);

		long N = sc.nextLong();

		for(long i = N; i > 0; i--){
			if(Math.sqrt(i) % 1.0 == 0.0){
				System.out.println(i);
				break;
			}
		}
	}
}