
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
		long GreedAnswer = 0;
		long anotherAns = 0;
		for(int i = 0; i < D; i++) {
			sum = 0;
			long max = -1;
			int Gtemp = 0;
			int Atemp = 0;
			for(int j = 0; j < 26; j++) {
				if(s[i][j] > max) {
					max = s[i][j];
					Atemp = j;
				}
				if(s[i][j] - c[i] > max) {
					max = s[i][j] - c[i];
					Atemp = j;
				}
			}

			int eleG = last[Gtemp];
			last[Gtemp] = i+1;
			for(int j = 0; j < 26; j++) {
				sum = sum + c[j]*( (i+1) - last[j] );
			}
			GreedAnswer = GreedAnswer + s[i][Gtemp] - sum;

			last[Gtemp] = eleG;
			int eleA = last[Atemp];
			last[Atemp] = i+1;
			for(int j = 0; j < 26; j++) {
				sum = sum + c[j]*( (i+1) - last[j] );
			}
			anotherAns = anotherAns+ s[i][Atemp] - sum;
			
			if(anotherAns >= GreedAnswer) {
				GreedAnswer = anotherAns;
				System.out.println(Atemp+1);
			}else {
				anotherAns = GreedAnswer;
				last[Gtemp] = i+1;
				last[Atemp] = eleA;
				System.out.println(Gtemp+1);
			}
//			System.out.println(answer);
		}
	}

}
