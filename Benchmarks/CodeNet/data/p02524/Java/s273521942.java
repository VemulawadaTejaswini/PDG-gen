import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			double a,b,C;
			a = scan.nextInt();
			b = scan.nextInt();
			C = scan.nextInt();
			C = Math.toRadians(C);
			double S = 1.0 / 2.0 * a * b * Math.sin(C);
			double L = a + b +Math.sqrt(Math.pow(a,2) + Math.pow(b, 2) - 2.0 * a * b * Math.cos(C));
			double h = 2 * S / a;
			System.out.println(S);
			System.out.println(L);
			System.out.println(h);
		}finally{
			scan.close();
		}
	}
}