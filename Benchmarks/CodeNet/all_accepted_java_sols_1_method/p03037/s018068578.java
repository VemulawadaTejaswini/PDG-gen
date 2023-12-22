import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		int Lmax = 1;
		int Rmin = N;
		for(int i=0;i<M;i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
			Lmax = Math.max(Lmax,L[i]);
			Rmin = Math.min(Rmin, R[i]);
		}
		
		int count = 0;
		for(int i=1;i<=N;i++) {
			if(i>=Lmax && i<=Rmin) {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();		
	}

}