import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] ab = new double[2];
		ab[0] = (sc.nextDouble());
		ab[1] = (sc.nextDouble());
		int c = (int)(ab[0] * ab[1]);
		int d = (int)(2. * (ab[0] + ab[1]));
		System.out.print(c);
		System.out.print(" ");
		System.out.print(d);
		System.out.println();
	}
}
