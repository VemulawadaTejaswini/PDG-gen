import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int k = 0; k < count; k++) {
			String x = sc.next();
			String y = sc.next();
			int s = x.length();
			int t = y.length();
			int[][] table = new int[s + 1][t + 1];
			
			
			for(int i = 1; i <= s; i++) {
				for(int j = 1; j <= t; j++) {
					if(x.charAt(i - 1) == y.charAt(j - 1)) {
						table[i][j] = table[i - 1][j - 1] + 1;
					}else {
						table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
					}
				}
			}
			System.out.println(table[s][t]);
		}
	}
}
