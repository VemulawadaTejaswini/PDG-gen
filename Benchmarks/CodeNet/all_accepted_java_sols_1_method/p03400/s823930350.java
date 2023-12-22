import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();

		int A[] = new int[N];

		for(int n=0;n<N;n++){
			A[n] = sc.nextInt();
		}

		int ans = X;

		for(int n=0;n<N;n++){
			ans += (D-1)/A[n]+1;
		}

		System.out.println(ans);

	}
}