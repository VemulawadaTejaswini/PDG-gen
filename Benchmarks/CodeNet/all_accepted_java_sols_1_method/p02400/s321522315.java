import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = Double.parseDouble(sc.next());
		double p = Math.PI;

		System.out.printf("%f %f\n",r*r*p,2*r*p);
	}
}