import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static boolean[][] wrong;
	public static int[][] number;
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for(int i = 0; i < n; i++) {
			wrong = new boolean[9][9];
			number = new int[9][9];
			for(int j = 0; j < 9; j++) {
				for(int k = 0; k < 9; k++) {
					number[j][k] = stdIn.nextInt();
				}
			}
			
			checkA();
			checkB();
			checkC();
		
			for(int j = 0; j < 9; j++) {
				for(int k = 0; k < 9; k++) {
					if(wrong[j][k]) {
						System.out.print("*" + number[j][k]);
					}
					else {
						System.out.print(" "+number[j][k]);
					}
				}
				System.out.println();
			}
			if(i != n-1) 
			System.out.println();
		}
	}
	
	public static void checkA() {
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						int tmp = number[x + 3*i][y + 3*j];
						int xp = x + 3*i;
						int yp = y + 3*j;
						
						for(int k = 0; k < 3; k++) {
							for(int l = 0; l < 3; l++) {
								if(xp == k + 3*i && yp == l + 3*j) {
									continue;
								}
								if(tmp == number[k + 3*i][l + 3*j]) {
									wrong[k+3*i][l+3*j] = true;
								}
							}
						}
					}
				}
			}
		}
		
		
		
	}
	
	public static void checkB() {
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				int tmp = number[i][j];
				
				for(int k = 0; k < 9; k++) {
					if(j == k) {
						continue;
					}
					if(tmp == number[i][k]) {
						wrong[i][k] = true;
					}
					
					
				}
			}
		}
	}
	
	public static void checkC() {
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				int tmp = number[j][i];
				
				for(int k = 0; k < 9; k++) {
					if(j == k) {
						continue;
					}
					if(tmp == number[k][i]) {
						wrong[k][i] = true;
					}
					
				}
			}
		}
	}
 
}