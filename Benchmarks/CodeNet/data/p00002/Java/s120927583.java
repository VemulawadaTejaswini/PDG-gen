import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y;
		while (scan.hasNextInt()) {
			x=scan.nextInt();
			y=scan.nextInt();
			System.out.println(String.valueOf(x+y).length());
		}
	}
}