import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [][] A = new int[n][m];
		int [] 	c = new int[n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
					A[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < m; i++){
			int b = sc.nextInt();
			for(int j = 0; j < n; j++){
				c[j] += A[j][i] * b;
			}
		}
        for (int i = 0; i < n; i++) {
            System.out.println(c[i]);
        }
	}
}
