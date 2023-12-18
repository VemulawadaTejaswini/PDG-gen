

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		double zishinKakudo =  (Math.PI*m/6/60)+(Math.PI*h/6);
		double hunshinKakudo = Math.PI*2*m/60;
		
		double diff = Math.abs(zishinKakudo - hunshinKakudo);
		if(diff > Math.PI) {
			diff = diff - Math.PI;
		}
		
		double l = Math.sqrt(a*a+b*b-(2*a*b*Math.cos(diff)));
		System.out.println(l);
		
	}

}
