import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int dataSet = sc.nextInt();
				if(!(dataSet==0)){
				for (int i = 0; i < dataSet; i++) {
					double x1 = sc.nextDouble();
					double y1 = sc.nextDouble();
					double x2 = sc.nextDouble();
					double y2 = sc.nextDouble();
					double x3 = sc.nextDouble();
					double y3 = sc.nextDouble();
					double x4 = sc.nextDouble();
					double y4 = sc.nextDouble();
					if (isParallelism(x1, y1, x2, y2, x3, y3, x4, y4))
						System.out.println("YES");
					else
						System.out.println("NO");
				}
				}else{
					break;
				}
			}
		} finally {
			sc.close();
		}
	}

	public static boolean isParallelism(double x1, double y1, double x2,
			double y2, double x3, double y3, double x4, double y4) {
		double a = (y2 - y1) / (x2 - x1);
		double b = (y4 - y3) / (x4 - x3);
		if (a == b) {
//			(x1 == x2 && x3 == x4) || (y1 == y2 && y3 == y4) ||
			return true;
		} else {
			return false;
		}
	}
}