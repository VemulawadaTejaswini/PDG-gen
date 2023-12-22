/*Digit Number*/

import java.util.*;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int l = sc.nextInt();
			int m = sc.nextInt();
			
			int n = l + m;
			
			System.out.println((n+"").length());
		}
		sc.close();
	}
}