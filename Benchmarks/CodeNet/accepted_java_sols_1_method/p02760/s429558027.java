import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int [][] a = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				a[i][j] = stdIn.nextInt();
			}
		}
		
		boolean [][] flag = new boolean[3][3];
		
		int n = stdIn.nextInt();
		
		for(int i = 0; i < n; i++) {
			int b = stdIn.nextInt();
			
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					if(b == a[j][k]) {
						flag[j][k] = true;
					}
				}
			}
			
		}
		
		
		if(flag[0][0] && flag[1][0] && flag[2][0] || flag[0][1] && flag[1][1] && flag[2][1] || flag[0][2] && flag[1][2] && flag[2][2] || flag[0][0] && flag[0][1] && flag [0][2] || flag[1][0] && flag[1][1] && flag[1][2] || flag[2][0] && flag[2][1] && flag[2][2] || flag[0][0] && flag[1][1] && flag[2][2] || flag[0][2] && flag[1][1] && flag[2][0]) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		
	}

}
