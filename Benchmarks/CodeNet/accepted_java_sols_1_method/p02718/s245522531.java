import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
		int S = 0;
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
			S += A[i];
		}
		int th = (S + 4 * M - 1) / (4 * M);
		int k = 0;
		for(int i = 0 ; i < N ; ++i){
			if(A[i] >= th){
				++k;
			}
		}
		if(k >= M){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
	}
}
