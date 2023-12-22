import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner k = new Scanner(System.in);
		double r = k.nextDouble();
		System.out.printf("%.10f %.10f\n",r*r*Math.PI,2*r*Math.PI);
		
	}

}