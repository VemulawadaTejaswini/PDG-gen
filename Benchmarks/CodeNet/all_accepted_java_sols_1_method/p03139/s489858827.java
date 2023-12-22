import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int max;
			int min;
			
			if (A < B) {
				max = A;
			} else {
				max = B;
			}
			
			if (N - (A + B) > 0) {
				min = 0;
			} else {
				min = (A + B) - N;
			}
			System.out.println(max + " " + min);		
		}
		
	}

}