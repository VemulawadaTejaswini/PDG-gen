import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		int[][] c = new int[3][3];
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < 3;j++){
				c[i][j] = s.nextInt();
			}
		}
		
		boolean can = true;
		can &= c[0][0] - c[1][0] == c[0][1] - c[1][1];
		can &= c[0][1] - c[1][1] == c[0][2] - c[1][2];
		can &= c[1][0] - c[2][0] == c[1][1] - c[2][1];
		can &= c[1][1] - c[2][1] == c[1][2] - c[2][2];/**/
		
		System.out.println(can ? "Yes" : "No");
	}

}
