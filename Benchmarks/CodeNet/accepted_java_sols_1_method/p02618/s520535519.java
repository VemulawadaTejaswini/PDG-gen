
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int D = Integer.parseInt(line);
		int[] c = new int[26];//26
		int[][] s = new int[D][26];//26
//		int[] t = new int[D];
		int[] last = new int[26];

		line = sc.nextLine();
		String[] lines = line.split(" ");
		for(int i = 0; i < lines.length; i++) {
			c[i] = Integer.parseInt(lines[i]);
		}

		for(int i = 0; i < D; i++) {
			line = sc.nextLine();
			lines = line.split(" ");
			for(int j = 0; j < 26; j++) {
				s[i][j] = Integer.parseInt(lines[j]);
			}
		}

//		for(int i = 0; i < D; i++) {
//			for(int j = 0; j < 26; j++) {
//				System.out.print(s[i][j] + " ");
//			}
//			System.out.println();
//		}

		long sum = 0;
//		long answer = 0;
		for(int i = 0; i < D; i++) {
			sum = 0;
			long max = -1;
			int temp = 0;
			for(int j = 0; j < 26; j++) {
				sum = sum + c[j];
				if(s[i][j] > max) {
					max = s[i][j];
					temp = j;
				}
			}
			last[temp] = i+1;
			System.out.println(temp+1);

//			for(int j = 0; j < 26; j++) {
//				sum = sum + c[j]*( (i+1) - last[j] );
//			}
//			answer = answer + s[i][t[i]] - sum;
//			System.out.println(answer);
		}
	}

}
