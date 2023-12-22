import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int P = scan.nextInt();
		int x = A*P;
		int y = B;
		if(P > C){
			y += (P-C)*D;
		}
		if(x < y){
			System.out.println(x);
		}else{
			System.out.println(y);
		}
	}
}