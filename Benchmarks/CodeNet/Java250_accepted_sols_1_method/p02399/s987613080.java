public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		//StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int d = a / b;
		int r = a % b;
		double da = (double) a;
		double db = (double) b;
		double f = da / db;
		System.out.print(d + " " + r + " ");
		System.out.printf("%.5f",f);
		System.out.println();
	}
}