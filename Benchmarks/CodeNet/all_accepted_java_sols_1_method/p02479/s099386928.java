import java.util.Scanner;


class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double r = input.nextDouble();
		
		
		//System.out.println(r);
		
		System.out.printf("%.6f %.6f\n", r * r * Math.PI, r * 2 * Math.PI);
		//System.out.println((r * r * Math.PI) + " " + (r * 2 * Math.PI));
	}
}