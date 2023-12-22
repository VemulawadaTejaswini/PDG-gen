

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int taps = 1;
		int count = 0;
		while(taps<b) {
			count++;
			taps += a-1;
		}
		
		System.out.println(count);
	}

}
