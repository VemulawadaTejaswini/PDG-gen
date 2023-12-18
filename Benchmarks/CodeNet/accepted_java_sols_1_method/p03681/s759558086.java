import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		sc.close();

		long ans = 1;
		long INF = 1000000007;

		//犬パターン
		for(long i = 1 ; i <= N ; i++){
			ans = ((ans*i)%INF);
			//System.out.println(i + " " + ans%INF);
		}

		if(M<N-1){
			System.out.println("0");
		}
		else if(M-(N-1)>2){
			System.out.println("0");
		}
		else{
			for(long i = M ; i > M-N+1 ; i--){
				ans = ((ans*i)%INF);
			}
			if(M-(N-1)==0){
				System.out.println(ans%INF);
			}
			if(M-(N-1)==1 ||M-(N-1)==2){
				System.out.println((2*ans)%INF);
			}
		}

	}
}
