package aoj0033;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] boll = new int[n][10];
		for(int k = 0; k < n; k++) {
			for(int i = 0; i  < 10; i++) {
				boll[k][i] = scan.nextInt();
			}
		}
		
		int judg = 0;
		for(int i = 0; i < n; i++) {
			int right,left;
			right = boll[i][0];
			left = 0;
			for(int k = 1; k < 10; k++) {
				if(right > boll[i][k]) {
					if(left < boll[i][k]) {
						left = boll[i][k];
					}
					else {
						judg = 0;
						break;
					}
				}
				else if(right < boll[i][k]) {
					right = boll[i][k];
				}
				judg = 1;
			}
			if(judg == 0) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}