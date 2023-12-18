import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		int n = scan.nextInt();
		while(n != 0){
			int hantei = 0;
			int syain[][] = new int[n][3];
			int sam[] = new int[n];
			for(int i = 0 ; i < n ; i++){
				for(int j = 0 ; j < 3 ; j++){
					syain[i][j] = scan.nextInt();
				}
				sam[i] = syain[i][1]*syain[i][2];
				for(int k = i-1 ; k >= 0 ; k--){
					if(syain[k][0] == syain[i][0]){
						sam[i] =sam[i] + sam[k];
						sam[k] = 0;
					}
				}
			}
			for(int i = 0 ; i < n ; i++){
				if(sam[i] >= 1000000){
					System.out.println(syain[i][0]);
					++hantei;
				}
			}
			if(hantei == 0){
				System.out.println("NA");
			}
			n = scan.nextInt();
		}
	}
}