import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int m = stdIn.nextInt();
		int n = stdIn.nextInt();
		int a[][] = new int[m][n];
		int b[] = new int[n];
		int ans;
		for(int i=0; i < m; i++){
			for(int j=0; j < n; j++){
				a[i][j]=stdIn.nextInt();
			}
		}
		for(int k=0; k < n; k++){
			b[k]=stdIn.nextInt();
		}
		stdIn.close();
		for(int x=0; x < m; x++){
			ans =0;
			for(int y=0; y < n; y++){
			ans+=a[x][y]*b[y];
			}
			System.out.println(ans);
		}
	}
}

