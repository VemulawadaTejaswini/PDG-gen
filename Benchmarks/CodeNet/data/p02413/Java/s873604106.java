import java.util.Scanner;

public class Main {

	void main() {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] table = new int[r+1][c+1];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				table[i][j] = sc.nextInt();
				}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<=c;j++) {
				if(j!=c) {
					table[i][c] += table[i][j];
				}
				table[r][j] += table[i][j];
			}
		}
		for(int i=0;i<=r;i++) {
			for(int j=0;j<=c;j++) {
				if(j==0) {
					System.out.print(table[i][j]);
				}
                         else {
					System.out.print(" "+table[i][j]);
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		new Main().main();
        }
}


  

 



