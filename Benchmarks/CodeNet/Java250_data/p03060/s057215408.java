import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		
		int V[] = new int[N];
		for(int i = 0; i < N; i++) {
			V[i] = stdIn.nextInt();
		}
		int C[] = new int[N];
		for(int j = 0; j < N; j++) {
			C[j] = stdIn.nextInt();
		}
		
		int max = 0;
		for(int k = 0; k < N; k++) {
			if(V[k] > C[k]) {
				max += (V[k]-C[k]);
			}
		}
		System.out.println(max);

	}

}