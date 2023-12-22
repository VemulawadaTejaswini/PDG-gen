import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int n = Integer.parseInt(std.next());
		int m = Integer.parseInt(std.next());

		int matrix[][] = new int[n][m];
		for(int i=0; i<=n-1; i++){
			for(int j=0; j<=m-1; j++){
				matrix[i][j] = Integer.parseInt(std.next());
			}
		}

		int vector[] = new int [m];
		for(int k=0; k<=m-1; k++){
			vector[k] = Integer.parseInt(std.next());
		}

		for(int i=0; i<=n-1; i++){
			int ans = 0;
			for(int j=0; j<=m-1; j++){
				ans += matrix[i][j] * vector[j];
			}
			System.out.println(ans);
		}
	}
}