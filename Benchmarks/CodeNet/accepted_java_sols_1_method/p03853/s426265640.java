import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		char c[][] = new char[h][w];

		for(int i=0;i<h;i++) {
			String str =scan.next();
			c[i]=str.toCharArray();
		}
		scan.close();

		for(int i=0;i<2*h;i++) {
			for(int j=0;j<w;j++) {
				System.out.print(c[(i)/2][j]);
			}
			System.out.println();
		}
	}
}