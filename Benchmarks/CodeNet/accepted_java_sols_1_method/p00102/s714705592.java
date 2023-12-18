import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int n = scan.nextInt();
		while(n != 0){
			int a[][] = new int[n+1][n+1];
			for(int i = 0 ; i < n ; i++){
				for(int j = 0 ; j < n ; j++){
					a[i][j] = scan.nextInt();
					a[i][n] += a[i][j];
				}
			}
			for(int j = 0 ; j < n ; j++){
				for(int i = 0 ; i < n ; i++){
					a[n][j] += a[i][j];
				}
			}
			for(int i = 0; i < n+1 ; i++){
				for(int j = 0 ; j < n+1 ; j++){
					int keta = Integer.toString(a[i][j]).length();
					for(int k = 0 ; k < 5-keta ; k++){
						System.out.print(" ");
					}
					System.out.print(a[i][j]);
				}
				System.out.println();
				a[n][n] += a[i][n];
			}
			n = scan.nextInt();
		}
	}
}