import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double S=r*r*Math.PI;
		double l=2*Math.PI*r;
		System.out.printf("%.6f %.6f\n",S,l);
	}
}