import java.util.*;

public class Main{
	public static void main(String[] args){
		int[][][] people = new int[4][3][10];
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					people[i][j][k] = 0;
				}
			}
		}

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int h = 0; h < n; h++){
			int b = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			int v = scan.nextInt();
			people[b - 1][f - 1][r - 1] += v;
		}

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					System.out.printf(" %d", people[i][j][k]);
				}
				System.out.println("");
			}
			if(i != 3){
				StringBuilder sb = new StringBuilder();
				for(int k = 0; k < 20; k++){
					sb.append("#");
				}
				String str = sb.toString();
				System.out.println(str);
			}
		}
	}
}