import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long min = N-1;
		for (int i = 1; i <= Math.sqrt(N); i++) {
			if(N%i==0) {
				long x = i+N/i-2;
				if(x<min) {
					min = x;
				}
			}
		}
		System.out.println(min);

	}
}