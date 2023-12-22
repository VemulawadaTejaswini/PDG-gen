import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		Integer[] B = new Integer[N];
		for(int i=0;i<N;i++) {
			int a = sc.nextInt();
			A[i] = a;
			B[i] = a;
		}
		
		Arrays.sort(B, Comparator.reverseOrder());
		int max = B[0];
		int secMax = B[1];
		
		for(int i=0;i<N;i++) {
			int skipInt = A[i];
			if(max != skipInt) {
				System.out.println(max);
			}else {
				System.out.println(secMax);
			}
		}
		
		sc.close();	
	}
}