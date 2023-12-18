import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int n = stdin.nextInt();
		int a = 2;
		int aN = 0;
		int b = 0;
		for(int i = 0; i < n - 1; i++) {
			
			b += i + 2;
			
		}
		
		aN = a + b;
		System.out.println(aN);
		
	}

}