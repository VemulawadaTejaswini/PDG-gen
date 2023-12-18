import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int n  = scan.nextInt();
		while(n != 0){
			int sam = 0;
			for(int i = 0 ; i < n/4 ; i++){
				int t = scan.nextInt();
				sam += t;
			}
			System.out.println(sam);
			n = scan.nextInt();
		}
	}
}