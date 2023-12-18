import java.util.Scanner;
public class Main {
	boolean[] dp = new boolean[1000000];//falseが素数
	
	void initialize(int num) {
		for(int r = 2; r * r <= num; r++) {
			for(int c = 2; r * c <= num; c++) {
				dp[r * c] = true;
			}
		}
	}
	
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			int num = stdIn.nextInt();
			int ans = 0;
			initialize(num);
			for(int r = 2; r <= num; r++)
				if(!dp[r]) ans++;
			System.out.println(ans);
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
}