import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Double r;
		Double PI=3.141592653589;
		r = sc.nextDouble();
		System.out.println(String.format("%.6f",r*r*PI)+ " " + String.format("%.6f",2*r*PI) );

	}

}