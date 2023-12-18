import java.util.Arrays;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		long[] A = new long[N];

		for(int i = 0;i < N;i++){
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);

		long one = 0;
		long sec = 0;
		for(int i = N-1;i>=1;i--){
			
			
			if(one == 0){
				if(A[i] == A[i-1]){
					one = A[i];
					i--;
				}
			}else{
				if(A[i] == A[i-1]){
					sec = A[i];
				}
			}
			
			
			if(one != 0 && sec != 0){
				System.out.println(one*sec);
				return;
			}
		}
		
		System.out.println(0);


	}
	

}