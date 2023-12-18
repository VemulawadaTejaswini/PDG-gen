import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] V = new int[N];
		int [] C = new int[N];
		int max = 0;
		for (int i=0;i<N;i++) {
			V[i]=sc.nextInt();		
		}
		for (int i=0;i<N;i++) {
			C[i]=sc.nextInt();
			if(V[i]-C[i]>0) {
				max+=V[i]-C[i];
			}
		}
		sc.close();
		System.out.print(max);
	}
}