import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
     	long ans = 0;
		int N = scan.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = scan.nextInt();
			ans += A[i];
		}
		
		int Q = scan.nextInt();
		
		for(int i=0;i<Q;i++) {
			int B = scan.nextInt();
			int C = scan.nextInt();
          
			for(int j=0;j<N;j++){
            	if(A[j] == B){
                   ans += C-A[j];
                   A[j] = C;
              	}
            }
			System.out.println(ans);
		}
	}
}