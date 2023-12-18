import java.util.Scanner;

import javax.xml.transform.OutputKeys;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		boolean ok = false;
		for (int i=0;i<=100;i++) {
			for (int j=0;j<=100;j++) {
				if (i + j == x && i * 2 + j * 4 == y) {
					ok = true;
					break;
				}
			}
		}
		if (ok)
		System.out.println("Yes");
		else 
			System.out.println("No");
	}
}
