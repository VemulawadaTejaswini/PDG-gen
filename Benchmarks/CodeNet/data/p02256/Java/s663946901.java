import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong(), b = scn.nextLong();
		while(a % b != 0) {
			long buf = b;
			b = a%b;
			a = buf;
		}
		System.out.println(b);
	}

}

