import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int a = in.nextInt();
			int oturi = (in.nextInt() - a) / 100;
			if (a == 0 && oturi == 0) {
				break;
			}
			System.out.print(oturi % 5);
			oturi /= 5;
			System.out.print(" ");
			System.out.print((oturi % 2));
			oturi /= 2;
			System.out.print(" ");
			System.out.println(oturi);
		}
		in.close();
	}
}