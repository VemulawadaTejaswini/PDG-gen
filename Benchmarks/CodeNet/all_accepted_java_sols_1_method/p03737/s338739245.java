import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		String s1 = io.next();
		String s2 = io.next();
		String s3 = io.next();
		
		System.out.print( s1.toUpperCase().charAt(0));

		System.out.print( s2.toUpperCase().charAt(0));

		System.out.println( s3.toUpperCase().charAt(0));
	}
}