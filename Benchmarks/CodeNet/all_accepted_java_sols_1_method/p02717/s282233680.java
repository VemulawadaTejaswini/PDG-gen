import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int z1 = scan.nextInt();
		
		int x2 = y1;
		int y2 = x1;
		int z2 = x2;
		x2 = z1;
		
		System.out.println(x2 + " " + y2 + " " + z2);
		
	}
}
