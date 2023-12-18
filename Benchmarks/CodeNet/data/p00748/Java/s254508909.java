import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true){
			int input = Integer.parseInt(s.nextLine());
			if(input == 0)
				return;
			System.out.println(solve(input));
		}
	}

	@SuppressWarnings("unchecked")
	public static String solve(int input) {
		int c = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1 ; (i*(i+1)*(i+2))/6 <= input ; i++) {
			c = i;
			list.add((i*(i+1)*(i+2))/6);
		}

		int[][] dp = new int[input][c];
		int[][] dp2 = new int[input][c];

		for(int i=0 ; i<c ; i++) {
			int v = Integer.parseInt(list.get(i).toString());
			for(int j=0 ; j<input ; j++) {
				if((v%2) != 0){
					if(i == 0){
						dp[j][0] = j+1;
						dp2[j][0] = j+1;
					}else {
						if(((j+1)%v) == 0) {
							dp[j][i] = Math.min(((j+1)/v), dp[j][i-1]);
							dp2[j][i] = Math.min(((j+1)/v), dp2[j][i-1]);
						}else if((j+1) < v) {
							dp[j][i] = dp[j][i-1];
							dp2[j][i] = dp2[j][i-1];
						}else {
							dp[j][i] = Math.min(((j+1)/v)+dp[((j+1)%v) - 1][i-1], dp[j][i-1]);
							dp2[j][i] = Math.min(((j+1)/v)+dp2[((j+1)%v) - 1][i-1], dp2[j][i-1]);
						}
					}
				}else {
					dp2[j][i] = dp2[j][i-1];
					if(i == 0){
						dp[j][0] = j+1;
					}else {
						if(((j+1)%v) == 0) {
							dp[j][i] = Math.min(((j+1)/v), dp[j][i-1]);
						}else if((j+1) < v) {
							dp[j][i] = dp[j][i-1];
						}else {
							dp[j][i] = Math.min(((j+1)/v)+dp[((j+1)%v) - 1][i-1], dp[j][i-1]);
						}
					}
				}
			}
		}

		return dp[input-1][c-1] + " " + dp2[input-1][c-1];
	}
}