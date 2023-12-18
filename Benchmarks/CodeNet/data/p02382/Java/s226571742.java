import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		short[] xArray = new short[n];
		short[] yArray = new short[n];
		for (int i = 0; i < xArray.length; i++) {
			xArray[i] = sc.nextShort();
		}
		for (int i = 0; i < yArray.length; i++) {
			yArray[i] = sc.nextShort();
		}
		Calc cl = new Calc();
		for (byte i = 1; i <= 4; i++) {
			System.out.printf("%f\n", cl.calcDistance(xArray, yArray, i));
		}
	}
}

class Calc {
	public double calcDistance(short[] xArray, short[] yArray, byte operation) {
		double[] calcArray = new double[xArray.length];
		if (operation > 0 && operation < 4) {
			for (int i = 0; i < calcArray.length; i++) {
				calcArray[i] = Math.abs(Math.pow(xArray[i] - yArray[i], operation));
			}
			double sum = 0;
			for (int i = 0; i < calcArray.length; i++) {
				sum += calcArray[i];
			}
			switch (operation) {
				case 1:
					return sum;
				case 2:
					return Math.sqrt(sum);
				case 3:
					return Math.cbrt(sum);
				default:
					break;
			}
		} else if (operation == 4) {
			for (int i = 0; i < calcArray.length; i++) {
				calcArray[i] = Math.abs(xArray[i] - yArray[i]);
			}
			double max = calcArray[0];
			for (int i = 1; i < calcArray.length; i++) {
				if (max < calcArray[i]) {
					max = calcArray[i];
				}
			}
			return max;
		}
		return -1;
	}
}
