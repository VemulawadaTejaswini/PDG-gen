import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] S = new int[N];
		for(int i = 0 ; i < N ; i++){
			S[i] = sc.nextInt();
		}
		sc.close();

		if(N==K){
			System.out.println(1);
		}
		else{
			int ans = 0;
			for(int i = K; i < N ; i+=(K-1)){
				ans++;
			}
			ans++;
			System.out.println(ans);
		}
	}
}
