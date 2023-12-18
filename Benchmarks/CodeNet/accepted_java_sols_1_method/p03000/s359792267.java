import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] L = new int[N];
		
		for(int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}
		
		int[] D = new int[N + 1];
		int count = 0;
		
		for(int i = 0; i < N + 1; i++) {
			if(i == 0) {
				D[i] = 0;
			} else {
				D[i] = D[i - 1] + L[i - 1];
			}
			if(D[i] <= X) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
