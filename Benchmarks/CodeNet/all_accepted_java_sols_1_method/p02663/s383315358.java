import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int sH = in.nextInt();
		int sM = in.nextInt();
		int eH = in.nextInt();
		int eM = in.nextInt();
		int stM = in.nextInt();

		int diffHr = eH - sH;
		int diffM = eM - sM;
		System.out.print(((diffHr * 60) + diffM - stM));

		in.close();
	}

}
