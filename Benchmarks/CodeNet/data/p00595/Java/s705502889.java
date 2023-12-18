import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		while(true){
			if(num1 % num2 != 0){
				int amari = num1 % num2;
				num1 = num2;
				num2 = amari;
			}else{
				System.out.println(num2);
			}
		}
	}
}