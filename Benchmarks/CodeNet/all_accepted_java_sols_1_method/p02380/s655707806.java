import java.util.Scanner;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		double a,b,C,S,L,h,to,cos,sin;
		String str;
		
		a = as.nextDouble();
		b = as.nextDouble();
		C = as.nextDouble();
		
		sin = Math.sin(Math.toRadians(C));
		cos = Math.cos(Math.toRadians(C));
		
		S = a * (b * sin) / 2;
		
		to = Math.sqrt(a * a + b * b - 2*(a * b * cos));
		
		L = a + b + to;
		
		h = b * sin;
		
		str = String.valueOf(S);
		System.out.println(str);
		str = String.valueOf(L);
		System.out.println(str);
		str = String.valueOf(h);
		System.out.println(str);

	}

}