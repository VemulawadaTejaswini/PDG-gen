import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.printf("%f %f", 2*Math.PI*r, Math.PI*r*r);
	}
}