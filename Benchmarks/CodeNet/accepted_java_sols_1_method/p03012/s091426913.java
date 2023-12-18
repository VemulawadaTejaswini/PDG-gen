import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		int S1 = 0;
		int S2 = 0;
		int del = 10000000;
		
		for(int i=0; i<N; i++) {
			sum += a[i];
		}
		
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<=i ;j++) {
				S1 += a[j];
			}
			S2 = sum - S1;			
			del = Math.min(Math.abs(S1-S2), del);	
			S1 = 0;
		}
		
		System.out.println(del);
		
	}
}
