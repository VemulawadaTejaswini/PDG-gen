public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] pt = new double[4];

		for (int i = 0; i < 4; i++) {
			pt[i] = sc.nextDouble();
		}

		double distance = Math.pow(pt[2] - pt[0], 2) + Math.pow(pt[3] - pt[1], 2);
		distance = Math.sqrt(distance);

		System.out.println(distance);

		sc.close();

	}

}

