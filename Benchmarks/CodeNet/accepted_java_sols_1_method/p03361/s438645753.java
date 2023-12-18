import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[][] S = new String[H][W];

		for(int i = 0; i < H; i++) {
			S[i] = sc.next().split("");
		}

		String result = "Yes";
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(S[i][j].equals(".")) continue;
				if(i -1 >= 0 && S[i-1][j  ].equals("#")) continue;
				if(i +1 <  H && S[i+1][j  ].equals("#")) continue;
				if(j -1 >= 0 && S[i  ][j-1].equals("#")) continue;
				if(j +1 <  W && S[i  ][j+1].equals("#")) continue;
				result = "No";
				break;
			}
		}
		System.out.println(result);
		sc.close();
	}
}
