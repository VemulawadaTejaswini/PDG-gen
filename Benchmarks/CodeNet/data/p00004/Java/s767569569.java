import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String[] data = scan.nextLine().split(" ", 0);
			double[] num = new double[6];
			for (int i = 0; i < 6; i++) {
				num[i] = Double.parseDouble(data[i]);
			}
			double x = (num[2]*num[4]-num[1]*num[5])/(num[0]*num[4]-num[1]*num[3]);
			double y = -(num[2]*num[3]-num[0]*num[5])/(num[0]*num[4]-num[1]*num[3]);
			System.out.println(x + " " + y);
		}
	}
}