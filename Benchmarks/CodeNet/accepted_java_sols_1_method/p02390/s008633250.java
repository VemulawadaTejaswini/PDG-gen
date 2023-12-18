

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int h = n/3600;
		int min = n%3600/60;
		int s = n%3600%60;
		
		System.out.println(h+":"+min+":"+s);
	}
}

