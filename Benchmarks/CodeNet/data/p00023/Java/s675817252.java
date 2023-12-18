import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		Circle[] c = new Circle[2];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 2; j++) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				double r = sc.nextDouble();
				c[j] = new Circle(x, y, r);
			}
			double l1 = norm(c[0].x, c[0].y, c[1].x, c[1].y);
			//System.out.println(l1);
			if(l1 < c[0].r - c[1].r) {
				sb.append(2).append("\n");
			}else if(l1 < c[1].r - c[0].r) {
				sb.append(-2).append("\n");
			}else if(l1 > c[0].r + c[1].r) {
				sb.append(0).append("\n");
			}else {
				sb.append(1).append("\n");
			}
		}
		sc.close();
		System.out.print(sb.toString());
	}
	static double norm(double x1, double y1, double x2, double y2) {
		double ret = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
		return Math.sqrt(ret);
	}
	static class Circle{
		double x, y, r;
		Circle(double x, double y, double r){
			this.x = x;
			this.y = y;
			this.r = r;
		}
	}
}
