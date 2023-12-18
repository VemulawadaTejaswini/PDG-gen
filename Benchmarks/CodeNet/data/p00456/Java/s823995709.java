import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		int wk[][] = new int[2][10];
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < 10 ; j++){
				wk[i][j] = scan.nextInt();
			}
		}
		 int WK[][] = new int[2][3];
		 int hantei = 0;
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				WK[i][j] = wk[i][0];
				hantei = 0;
				for(int k = 1 ; k < 10 ; k++){
					if(WK[i][j] < wk[i][k]){
						WK[i][j] = wk[i][k];
						hantei = k;
					}
				}
				wk[i][hantei] = -1;
			}
		}
		System.out.println((WK[0][0] + WK[0][1] + WK[0][2]) + " " + (WK[1][0] + WK[1][1] + WK[1][2]));
	}
}