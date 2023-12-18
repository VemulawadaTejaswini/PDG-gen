import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		System.out.println("??????????????\?????????????????????");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		Scanner scn = new Scanner(System.in);
		int b= scan.nextInt();
		int c=(a+b);
		System.out.println(c+" "+Integer.toString( c ).length());
	}
}