import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int x= scan.nextInt();
		int y= scan.nextInt();
		int z= scan.nextInt();
		scan.close();
		System.out.print(z+" "+x+" "+y);
	}
}
