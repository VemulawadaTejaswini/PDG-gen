import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt(), W = scan.nextInt();
		char field[][] = new char[H][W];
		int table[][] = new int[H][W];

		for(int i = 0; i < H; i++){
			String s = scan.next();
			for(int j = 0; j < W; j++){
				field[i][j] = s.charAt(j);
			}
		}
		
		table[0][0] = ((field[0][0] == '.')?0:1);
		
		for(int i = 1;i < W;i++){
			table[0][i] = table[0][i-1]+ ((field[0][i] != field[0][i-1])?1:0);
		}
		for(int i = 1;i < H;i++){
			table[i][0] = table[i-1][0]+ ((field[i][0] != field[i-1][0])?1:0);
		}
		
		for(int n = 2; n <= W + H - 2; n++){
			for(int i = 1; i < n; i++){
				if((n - i) < H && i < W)

				table[n - i][i] = Math.min(table[n-i-1][i] + ((field[n-i][i] != field[n-i-1][i])?1:0), table[n - i][i - 1] + ((field[n-i][i]!=field[n-i][i-1])?1:0));
			}
		}

		System.out.println((table[H-1][W-1]+((field[H-1][W-1]=='.')?0:1))/2);
	}
}