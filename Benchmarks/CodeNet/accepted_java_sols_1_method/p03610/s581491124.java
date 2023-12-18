import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String n = sc.next();

		final String[] nList = n.split("");

		for (int j = 0; j < nList.length; j++) {
			if ((j + 1) % 2 > 0) {
				System.out.print(nList[j]);
			}
		}

	}

}