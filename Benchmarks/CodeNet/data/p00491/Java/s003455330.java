import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 = tomato2, 1 = tomato1, 2 = cream2, 3 = cream1,
		// 4 = basil2, 5 = basil1 ??¨??????
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans = 0;
		int[] prog = new int[N];
		int[][] table = new int[6][N];
		for(int i = 0; i < K; i++) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt();
			prog[A] = B;
		}
		switch(prog[0]) {
			case 0:
				table[1][0] = 1;
				table[3][0] = 1;
				table[5][0] = 1;
				break;
			case 1: //tomato1
				table[1][0] = 1;
				break;
			case 2: //cream1
				table[3][0] = 1;
				break;
			case 3: //basil
				table[5][0] = 1;
				break;
		}
		for(int i = 1; i < N; i++) {
			switch(prog[i]) {
				case 0:
					table[0][i] = (table[1][i - 1]); //tomato2
					table[1][i] = (table[2][i - 1] + table[3][i - 1] + table[4][i - 1] + table[5][i - 1]) % 10000; //tomato1
					table[2][i] = (table[3][i - 1]); //cream2
					table[3][i] = (table[0][i - 1] + table[1][i - 1] + table[4][i - 1] + table[5][i - 1]) % 10000; //cream1
					table[4][i] = (table[5][i - 1]); //basil2
					table[5][i] = (table[0][i - 1] + table[1][i - 1] + table[2][i - 1] + table[3][i - 1]) % 10000; //basil1
					break;
				case 1:
					table[0][i] = (table[1][i - 1]); //tomato2
					table[1][i] = (table[2][i - 1] + table[3][i - 1] + table[4][i - 1] + table[5][i - 1]) % 10000; //tomato1
					break;
				case 2:
					table[2][i] = (table[3][i - 1]); //cream2
					table[3][i] = (table[0][i - 1] + table[1][i - 1] + table[4][i - 1] + table[5][i - 1]) % 10000; //cream1
					break;
				case 3:
					table[4][i] = (table[5][i - 1]); //basil2
					table[5][i] = (table[0][i - 1] + table[1][i - 1] + table[2][i - 1] + table[3][i - 1]) % 10000; //basil1
					break;
			}
		}
		for(int i = 0; i < 6; i++) ans += table[i][N - 1];
		System.out.println(ans % 10000);
	}

}