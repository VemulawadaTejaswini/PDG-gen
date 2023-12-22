

import java.util.Scanner;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		int d = in.nextInt();
		int t = in.nextInt();
		int s = in.nextInt();
		
		int dist = s*t;
		
		System.out.println(dist>=d?"Yes":"No");
		
	}

}
