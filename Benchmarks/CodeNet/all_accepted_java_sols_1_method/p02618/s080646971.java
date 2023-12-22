import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int[] c = new int[26];
		for(int i = 0; i < 26; i++) {
			c[i] = sc.nextInt();
		}
		int[][] s = new int[d][26];
		for(int i = 0; i < d; i++) {
			for(int j = 0; j < 26; j++) {
				s[i][j] = sc.nextInt();
			}
		}
		int[] lastDay = new int[26];
		for(int i = 0; i < 26; i++) {
			lastDay[i] = 0;
		}
		long result = 0;
		for(int i = 1; i <= d; i++) {
			long max = 0;
			int check = 0;
			for(int j = 0; j < 26; j++) {
				long temp = 0;
				temp += s[i-1][j];
				for(int k = 0; k < 26; k++) {
					if(k != j) {
						temp -= c[k]*(i-lastDay[k]);
					}
				}
				if(max < temp) {
					max = temp;
					check = j;
				}
			}
			lastDay[check] = i;
			System.out.println(check+1);
		}
	}
}
