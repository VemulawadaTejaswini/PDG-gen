import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double r;
		double S,L;
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		S = r*r*Math.PI;
		L = r*2*Math.PI;
		System.out.printf("%f %f\n", S, L);

	}

}