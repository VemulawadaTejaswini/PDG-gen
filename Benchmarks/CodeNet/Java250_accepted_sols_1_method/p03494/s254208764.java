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
			boolean odd = false;
			for(int i = 0; i < N; i++) {
				if(A[i]%2 != 0) odd = true;
			}
			if(odd) break;
			for(int i = 0; i < N; i++) {
				A[i] /= 2;
			}
			count++;
		}
		System.out.println(count);
	}

}