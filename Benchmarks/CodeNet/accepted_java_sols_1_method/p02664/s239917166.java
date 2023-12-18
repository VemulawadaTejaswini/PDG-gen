import java.util.Scanner;

public class Main {
	static String T;
	static String n;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		T=sc.next();
		n=T.replaceAll("\\?","D");
		System.out.println(n);
	}
}