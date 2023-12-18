package ari;
import java.util.Scanner;
class Main{
	public void Germany() {
		Scanner sc = new Scanner(System.in);
		int a,b;
		int d;
		int r;
		double f;
		a = sc.nextInt();
		b = sc.nextInt();
		d = a / b;
		r = a % b;
		f = a / b;
		System.out.printf("%2d%2d%1.5f",d,r,f);
	}
	    public static void main(String[] args) {
	        new Main().Germany();
	    }
	}