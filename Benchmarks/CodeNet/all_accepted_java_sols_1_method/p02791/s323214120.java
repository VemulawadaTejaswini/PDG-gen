import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		for(int i=0; i<N; i++) {
			P[i] = sc.nextInt();
		}
		sc.close();
		int a = 0;
		int b = P[0];
		for(int i=0; i<N; i++) {
			if(P[i] <= b) {
				a++;
				b = P[i];
			}
		}
		System.out.println(a);
	}

}