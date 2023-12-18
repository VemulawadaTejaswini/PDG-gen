import java.util.Scanner;
public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double menseki =r*r*3.14159265,enshu =r*2*3.14159265;
		System.out.printf("%.5f %.5f\n",menseki,enshu);
	}
}