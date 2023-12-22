

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char[] n = str.toCharArray();

		for(int i=n.length-1; i>=0; i--){
			System.out.print(n[i]);
		}
		System.out.println();

	}

}