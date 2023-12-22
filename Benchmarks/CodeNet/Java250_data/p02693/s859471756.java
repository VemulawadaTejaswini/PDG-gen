import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int K = stdIn.nextInt();
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		
		int ans = K;
		
		for(int i = 1; ; i++) {
			if(A <= ans) {
				break;
			}else {
				ans += K;
			}
		}
		
		if(ans <= B) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
	}

}