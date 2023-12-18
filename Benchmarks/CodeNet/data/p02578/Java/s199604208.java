
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int max = 0;
		int result = 0;

		for(int i=0; i<N; i++) {
			
			int A = sc.nextInt();
			
			if(A >= max) {
				max=A; 
			}
			else {
				int s = max - A; 
				result +=s; 
			}

		}

		sc.close();
		System.out.println(result);
	
	}
}