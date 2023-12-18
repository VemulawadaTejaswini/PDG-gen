import java.util.Scanner;
public class Main {
	static int calcExpectation(int[][] memo, int dis, int money) {
		for(int r = 0; r < memo.length; r++) {
			int max = memo[0][1];
			int minusDis = memo[0][0], idx = 0;
			
			for(int c = 1; c < memo.length; c++) {
				if(memo[c][1] > max) {
					max = memo[c][1];
					minusDis = memo[c][0];
					idx = c;
				}
			}
			
			if(money >= minusDis) {
				money -= minusDis;
				memo[idx][0] = 0;
				memo[idx][1] = 0;
			} else {
				memo[idx][0] -= money;
				money = 0;
			}
			if(money == 0) break;
		}
		
		int ret = 0;
		for(int r = 0; r < memo.length; r++) {
			int num = memo[r][0] * memo[r][1];
			if(num > 0)
				ret += num;
		}
		return(ret);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if(n + m == 0) break;
			int[][] memo = new int[n][2];
			int sumDistance = 0;
			for(int r = 0; r < n; r++) {
				memo[r][0] = stdIn.nextInt(); //距離
				memo[r][1] = stdIn.nextInt(); //期待値
				sumDistance += memo[r][0];
			}
			System.out.println(calcExpectation(memo, sumDistance, m));
		}
	}
}