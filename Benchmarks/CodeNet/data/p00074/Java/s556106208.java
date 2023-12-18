import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	private Scanner sc;

	int[][] path;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			int t = Integer.parseInt(sc.nextLine());
			int h = Integer.parseInt(sc.nextLine());
			int s = Integer.parseInt(sc.nextLine());
			if ((t == -1) && (h == -1) && (s == -1)) break;

			int r1 = 7200 - (t * 3600 + h * 60 + s);
			int r3 = 7200 - ((t * 3600 + h * 60 + s) / 3);
			
			DecimalFormat df = new DecimalFormat("00");
			System.out.print(df.format(r1 / 3600) + ":" + df.format(r1 % 3600 / 60) + ":" + df.format(r1 % 60));
			System.out.print(df.format(r3 / 3600) + ":" + df.format(r3 % 3600 / 60) + ":" + df.format(r3 % 60));
		}
	}
}