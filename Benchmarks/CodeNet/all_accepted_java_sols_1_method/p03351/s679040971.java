import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		scan.close();
		System.out.println((Math.abs(c-a)<=d ||(Math.abs(b-a)<=d) && Math.abs(c-b)<=d)? "Yes": "No");
	}
}