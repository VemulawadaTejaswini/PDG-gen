import java.io.*;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws Exception{
	
		Scanner scan = new Scanner(System.in);
		
		
		String[] x = scan.readLine().split(" ");
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[0]);
		if(a < b){
			System.out.println("a < b");
		else(a > b){
			System.out.println("a > b");
		else("a == b");
			System.out.println("a == b");
		}
	}
}