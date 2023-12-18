import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		int a = scan.nextInt();
		int b = scan.nextInt();
		String u = scan.next();
		scan.close();
		System.out.println((s.equals(u))? (a-1)+" "+b:a+" "+(b-1) );
	}
}