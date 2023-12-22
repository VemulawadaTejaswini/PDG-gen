public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner scan = new java.util.Scanner(System.in);

		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();

		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();

		double kyoriX2 = (x1 - x2) * (x1 - x2);
		double kyoriY2 = (y1 - y2) * (y1 - y2);

		System.out.println(Math.sqrt(kyoriX2 + kyoriY2));
	}

}