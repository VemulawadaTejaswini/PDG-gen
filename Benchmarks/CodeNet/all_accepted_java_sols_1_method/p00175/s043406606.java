import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int n = scan.nextInt();
		while(n != -1){
			String mozi = "";
			while(n/4 != 0){
				mozi = String.valueOf(n%4)+mozi;
				n = n/4;
			}
			mozi = String.valueOf(n)+mozi;
			System.out.println(mozi);
			n = scan.nextInt();
		}
	}
}