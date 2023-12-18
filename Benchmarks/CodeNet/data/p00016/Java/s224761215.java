import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int turn = 90;
		double x = 0, y = 0;
		while (true) {
			String[] line = scanner.next().split(",");
			double d = Double.parseDouble(line[0]);
			int t = Integer.parseInt(line[1]);
			if (d == 0 && t == 0) break;
			double r = (double)turn * Math.PI / 180;
			x += d * Math.cos(r);
			y += d * Math.sin(r);
			turn -= t;
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}
}