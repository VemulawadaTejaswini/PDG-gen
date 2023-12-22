import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		for(int i = 0; i < 3; i++) for(int j = 0; j < 3; j++) c[i][j] = sc.nextInt();
		for(int j = 1; j < 3; j++) {
			for(int i = 0; i < 3; i++) c[j][i] -= c[0][i];
		}
		for(int j = 1; j < 3; j++) {
			for(int i = 0; i < 3; i++) c[i][j] -= c[i][0];
		}
		if(c[1][1] == 0 && c[1][2] == 0 && c[2][1] == 0 && c[2][2] == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
