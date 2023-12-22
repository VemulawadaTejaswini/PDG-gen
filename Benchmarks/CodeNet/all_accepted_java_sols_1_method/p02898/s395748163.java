import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		int h[] = new int[N];
		int ans = 0;
		for(int i = 0; i < N; i++){
			h[i] = stdIn.nextInt();
			if(h[i] >= K){
				ans++;
			}
		}
		System.out.println(ans);

		stdIn.close();
	}
}
