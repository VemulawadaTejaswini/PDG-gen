import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int M = scan.nextInt();
			long K = scan.nextLong();

			long[]A = new long[N];
			long[]sA =new long[N+1];
			int a = 0;
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextLong();
				sA[i+1] = sA[i]+A[i];
				if(sA[i+1]<=K)a=i+1;//常に更新し続ける
			}
			long[]B = new long[M];
			long[]sB =new long[M+1];
			for(int i = 0;i<M;i++) {
				B[i] = scan.nextLong();
				sB[i+1] = sB[i]+B[i];
			}


			int right = 0;
			int maxcount = 0;
			for(int i = a;i>=0;i--) {
				long valu = sA[i];
				int count = i;

				while(right+1<=M&&valu+sB[right+1]<=K) {
					right++;
				}
				//System.out.println(i+" "+right);
				if(maxcount<count+right)maxcount=count+right;
			}

			System.out.println(maxcount);




		}


	}


}
