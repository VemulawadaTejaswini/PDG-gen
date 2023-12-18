
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l,a,b,c,d,r1,r2;
		l = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		r1 = a / c;
		r2 = b / d;

		r1 += (a % c != 0)? 1 : 0;
		r2 += (b % d != 0)? 1 : 0;

		l -= Math.max(r1, r2);

		System.out.println(l);
	}
}