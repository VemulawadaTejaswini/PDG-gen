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
		long max = 0;
		for(int i = 0; i < d; i++) {
			int t = sc.nextInt()-1;
			max += s[i][t];
			lastDay[t] = i+1;
			for(int j = 0; j < 26; j++) {
				if(j != t) {
					max -= c[j] * (i+1-lastDay[j]);
				}
			}
			System.out.println(max);
		}
	}
}
