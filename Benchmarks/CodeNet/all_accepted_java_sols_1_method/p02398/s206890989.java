import java.util.Scanner;
public class Main{

	public static void main (String arg[]) {
		int Math = 0;
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		for (int x = a; x <= b ; x++) {
			if (c % x == 0) {
				Math += 1;
			}
			
		}
		System.out.println(Math);
		scan.close();

	}
}
