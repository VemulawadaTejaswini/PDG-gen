import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		int sum = 0;
		for(int i = 0 ; i < 4 ; i++){
			sum += scan.nextInt();
		}
		System.out.println(sum/60);
		System.out.println(sum%60);
	}
}