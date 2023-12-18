import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
     	long ans = 0;
		int N = scan.nextInt();
		int A[] = new int[100000];
		for(int i=0;i<N;i++) {
            int input = scan.nextInt();
            A[input-1] += 1;
            ans += input;
		}
		
		int Q = scan.nextInt();
		for(int i=0;i<Q;i++) {
            int B = scan.nextInt();
            int C = scan.nextInt();
          
            ans += A[B-1] * (C-B);
            System.out.println(ans);
          
			A[C-1] += A[B-1];
            A[B-1] = 0;
		}
	}
}