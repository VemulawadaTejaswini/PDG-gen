import java.util.Scanner;


class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		
		double s = r * r * Math.PI;
		double t = 2 * r * Math.PI;
		
		String S = String.format("%.6f",s);
		String T = String.format("%.6f",t);
		
		System.out.println(S + " " + T);
		
	}

}