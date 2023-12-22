import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int T = sc.nextInt();

		int[] K = new int[N];
		for(int i = 0 ; i < N ; i++){
			K[i] = sc.nextInt();
		}

		sc.close();
		long ans = 0;
		for(int i = 0 ; i < N-1 ; i++){
			if(K[i+1]-K[i] >= T){
				ans += T;
			}
			else{
				ans += K[i+1]-K[i];
			}
		}

		System.out.println(ans+T);
	}
}
