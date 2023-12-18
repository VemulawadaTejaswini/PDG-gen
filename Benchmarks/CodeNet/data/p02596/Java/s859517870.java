import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int K = stdIn.nextInt();
		int ans = -1;
		int amari = 7 % K;
		
		for(int i = 1; i <= K; i ++) {
			if(amari == 0) {
				ans = i;
				break;
			}else {
				amari = (amari * 10 + 7) % K;
			}
		}
		
		System.out.println(ans);
	}
}