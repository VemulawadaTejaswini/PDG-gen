public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		//StringBuilder sb = new StringBuilder();
		double r = sc.nextDouble();

		double menseki = r * r * Math.PI;
		double shuu = 2 * r * Math.PI;
		System.out.printf("%.5f %.5f\n",menseki,shuu);
	}
}