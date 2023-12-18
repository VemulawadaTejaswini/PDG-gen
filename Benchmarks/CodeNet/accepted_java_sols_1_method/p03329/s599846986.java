import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int N = scan.nextInt();
		int res = N;
		
		for(int i = 0; i <= N; i++) {
			int cc = 0;
			int t = i;
			while(t > 0) {
				cc += t % 6;
				t /= 6;
			}
			
			t = N - i;
			while(t > 0) {
				cc += t % 9;
				t /= 9;
			}
			
			if(res > cc) res = cc;
		}
		
		System.out.println(res);
	}
}
