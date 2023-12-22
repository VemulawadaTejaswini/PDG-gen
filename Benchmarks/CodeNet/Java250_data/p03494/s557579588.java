import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = stdIn.nextInt();
		}
		int count = 0;
		while(true) {
			for(int i = 0; i < N; i++) {
				if(A[i] % 2 == 0) {
					A[i] = A[i]/2;
				}
				else {
					System.out.println(count);
					System.exit(0);
				}
			}
			count++;
		}

	}

}