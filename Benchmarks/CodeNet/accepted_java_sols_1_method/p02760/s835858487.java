import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	String ans = "No";
	int[][] ai = new int[3][3];
	for(int i = 0 ; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
			ai[i][j] = sca.nextInt();
		}
	}
	boolean[][] flag = new boolean[3][3];
	for(int i = 0 ; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
			flag[i][j] = false;
		}
	}
	int n = sca.nextInt();
	int[] b = new int[n];
	for(int i = 0; i < n; i++) {
		b[i] = sca.nextInt();
		for(int j = 0 ; j < 3; j++) {
			for(int k = 0; k < 3; k++) {
				if(b[i] == ai[j][k]) {
					flag[j][k] = true;
				}
			}
		}
	}

	if(flag[0][0] == true && flag[0][1] == true && flag[0][2] == true) {
		ans = "Yes";
	}
	else if(flag[1][0] == true && flag[1][1] == true && flag[1][2] == true) {
		ans = "Yes";
	}
	else if(flag[2][0] == true && flag[2][1] == true && flag[2][2] == true) {
		ans = "Yes";
	}
	else if(flag[0][0] == true && flag[1][0] == true && flag[2][0] == true) {
		ans = "Yes";
	}
	else if(flag[0][1] == true && flag[1][1] == true && flag[2][1] == true) {
		ans = "Yes";
	}
	else if(flag[0][2] == true && flag[1][2] == true && flag[2][2] == true) {
		ans = "Yes";
	}
	else if(flag[0][0] == true && flag[1][1] == true && flag[2][2] == true) {
		ans = "Yes";
	}
	else if(flag[0][2] == true && flag[1][1] == true && flag[2][0] == true) {
		ans = "Yes";
	}
	System.out.println(ans);

	// 後始末
	sca.close();
	}
}