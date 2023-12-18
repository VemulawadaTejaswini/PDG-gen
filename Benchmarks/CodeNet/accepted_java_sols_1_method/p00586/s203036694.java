import java.util.InputMismatchException;
import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		try{
			while(true){
				int A = scan.nextInt();
				int B = scan.nextInt();
				System.out.println(A+B);
			}
		}catch(Exception e){
			
		}
	}
}