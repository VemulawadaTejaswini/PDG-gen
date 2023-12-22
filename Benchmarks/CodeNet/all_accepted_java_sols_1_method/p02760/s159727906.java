import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int bingo[][] = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				bingo[i][j] = scan.nextInt();
			}
		}
		
		int n = scan.nextInt();
		for(int h=0;h<n;h++) {
			int in_num = scan.nextInt();
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(bingo[i][j] == in_num) {
						bingo[i][j] = -1;
					}
				}
			}
		}
		
		for(int i=0;i<3;i++) {
			if(bingo[i][0] == -1 && bingo[i][1] == -1 && bingo[i][2] == -1) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		
		for(int i=0;i<3;i++) {
			if(bingo[0][i] == -1 && bingo[1][i] == -1 && bingo[2][i] == -1) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		
		if((bingo[0][0] == -1 && bingo[1][1] == -1 && bingo[2][2] == -1) || (bingo[2][0] == -1 && bingo[1][1] == -1 && bingo[2][0] == -1)) {
			System.out.println("Yes");
			System.exit(0);
		}
		
		System.out.println("No");
		
	}
	
}
