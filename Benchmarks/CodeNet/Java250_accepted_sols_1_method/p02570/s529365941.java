import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int D = Integer.parseInt(scan.next());
		int T = Integer.parseInt(scan.next());
		int S = Integer.parseInt(scan.next());

		if (D <= T*S) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
