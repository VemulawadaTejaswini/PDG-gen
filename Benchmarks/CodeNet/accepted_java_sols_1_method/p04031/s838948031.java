import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			long[] A = new long[N];
			int sum = 0;
			for(int i = 0 ; i < N ; i++){
				A[i] = sc.nextLong();
				sum+= A[i];
			}
			sc.close();


			int p1 = 0;
			int p2 = 0;

			int ans = 0;
			int ans2 = 0;
			if(sum%N == 0){
				p1 = sum/N;

				for(int i = 0 ; i < N ; i++){
					ans += Math.pow(Math.abs(A[i]-p1), 2);
				}
				System.out.println(ans);
			}
			else{
				p1 = sum/N;
				p2 = p1+1;

				for(int i = 0 ; i < N ; i++){
					ans += Math.pow(Math.abs(A[i]-p1), 2);
					ans2 += Math.pow(Math.abs(A[i]-p2), 2);
				}
				System.out.println(Math.min(ans, ans2));
			}

	}
}
