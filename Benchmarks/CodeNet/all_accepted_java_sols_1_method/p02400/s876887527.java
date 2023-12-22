import java.util.Scanner;
public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double menseki =r*r*3.1415926535897932384626433832795,enshu =r*2*3.1415926535897932384626433832795;
		System.out.printf("%.6f %.6f\n",menseki,enshu);
	}
}