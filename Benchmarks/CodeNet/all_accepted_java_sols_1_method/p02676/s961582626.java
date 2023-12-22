

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		String s = scan.next();
		scan.close();
		
		if(s.length() <= k) {
			System.out.println(s);
		}else {
			System.out.println(s.substring(0, k) + "...");
		}
	}

}
