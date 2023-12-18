

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = sc.nextInt();
	        int b = sc.nextInt();
	        System.out.println(gcd(a,b));
		}
	}
	
	public static int gcd(int x, int y) {
		if (y%x == 0) {
			return x;
		}
		return gcd(y%x, x);
		//return (x==0)?y:gcd(y%x,x);
	}

}

