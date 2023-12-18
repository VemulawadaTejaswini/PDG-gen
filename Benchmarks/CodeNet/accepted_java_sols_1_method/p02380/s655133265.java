import java.util.Scanner;

public class Main {

	/**
	 * 三角形の面積、周の長さ、高さを求める
	 * @param args0
	 */
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double angle = scan.nextDouble();
		
//		double a = Double.parseDouble(args[0]);
//		double b = Double.parseDouble(args[1]);
//		double angle = Double.parseDouble(args[2]);

		double S =0, L =0,h = 0;

		S = (a * b * Math.sin( angle * (Math.PI / 180) ) ) /2;
//		System.out.println(Math.sin(angle));
		L = a + b + Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2 * a * b * Math.cos(angle * (Math.PI/180)));
		h = S * 2 / a;

		System.out.println(S);
		System.out.println(L);
		System.out.println(h);





	}

}

