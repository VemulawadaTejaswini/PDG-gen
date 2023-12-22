
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long w = sc.nextLong();
		long h = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		
		double a1 = x*y, a2 = (w - x)*y, a3 = x*(h - y), a4 = (w - x)*(h - y);
//		System.out.println(a1+" "+a2+" "+a3+" "+a4);

//		System.out.print(Math.max(Math.min(a1 + a2, a3 + a4), Math.min(a1 + a3, a2 + a4)) + " ");
		System.out.print((double)w*h/2+" ");
		
//		if(Math.min(a1 + a2, a3 + a4) == Math.min(a1 + a3, a2 + a4)) {
		if((double)x == (double)w/2 && (double)y == (double)h/2) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
