import java.util.Scanner;

class Q10009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Double r;
		Double PI=3.141592653589;
		r = sc.nextDouble();
		System.out.println(( r*r*PI) + " " + String.format("%.9f",2*r*PI) );

	}

}