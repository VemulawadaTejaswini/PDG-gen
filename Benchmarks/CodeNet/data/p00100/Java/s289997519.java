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
			int syain[] = new int[n];
			int nedan[] = new int[n];
			int kosuu[] = new int[n];
			for(int i = 0 ; i < n ; i++){
				syain[i] = scan.nextInt();
				nedan[i] = scan.nextInt();
				kosuu[i] = scan.nextInt();
			}
			int cun = 0;
			int en[] = new int[n];
			for(int i = 0 ; i < n ; i++){
				en[i] = nedan[i] * kosuu[i];
			}
			for(int i = 0 ; i < n-1 ; i++){
				for(int j = i+1 ; j < n ; j++){
					if(syain[i] == syain[j]){
						en[i] = en[i] + en[j];
					}
				}
			}
			for(int i = 0 ; i < n ; i++){
				if(en[i] >= 1000000){
					System.out.println(syain[i]);
					cun = 1;
				}
			}
			if(cun == 0){
				System.out.println("NA");
			}
			n = scan.nextInt();
		}
	}
}