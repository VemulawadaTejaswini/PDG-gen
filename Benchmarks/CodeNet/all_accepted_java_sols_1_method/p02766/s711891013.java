import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextLong();
		int K = stdIn.nextInt();
		int ans = 1;
		for(;;){
			if(N < K){
				break;
			}
			N /= K;
			ans++;
		}
		System.out.println(ans);
		stdIn.close();
	}
}