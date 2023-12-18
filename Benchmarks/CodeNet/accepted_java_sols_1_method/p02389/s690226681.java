import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new java.util.Scanner(System.in);
		int a = scan.nextInt(); // height
		int b = scan.nextInt(); // width
		System.out.println(a * b + " " + (a + b) * 2);
	}
}