import java.util.Scanner;

public class Main{

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int ab = scan.nextInt();
		int bc = scan.nextInt();
		int ca = scan.nextInt();
		
		int s = (ab * bc) / 2;
		
		System.out.println(s);
	}
	
}
