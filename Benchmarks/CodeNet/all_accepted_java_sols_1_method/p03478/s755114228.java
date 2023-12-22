import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		int counter = 0;
		int counter2 = 0;
		
		for( int i = 1; i <= N; i++) {
			for( int j = i; j != 0; j /= 10) {
				counter += j % 10;	
			}
			if(A <= counter && B >= counter) {
				counter2 += i;
			}
			counter = 0;
		}
		System.out.println(counter2);
	}

}
