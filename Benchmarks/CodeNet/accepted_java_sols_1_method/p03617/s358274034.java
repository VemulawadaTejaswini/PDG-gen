import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		
		long q = scn.nextLong();
		long h = scn.nextLong();
		long s = scn.nextLong();
		long d = scn.nextLong();
		long n = scn.nextLong();
		h = Math.min(h,  2*q);
		s = Math.min(s, 2*h); d = Math.min(d, 2*s);
		n*=4;
		long w = ((n/8)*d); n %= 8;
		long x = ((n/4)*s); n %=4;
		long y = ((n/2)*h); n %=4;
		long z = ((n/1)*q); n%=1;
		
		System.out.println(w+x+y+z);
	}

}
