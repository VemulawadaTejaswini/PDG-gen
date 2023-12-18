import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double A = scn.nextInt();
		double B = scn.nextInt();
		double H = scn.nextInt();
		double M = scn.nextInt();

		double hx = A*Math.cos(Math.PI * 2 * H/12.0);
		double hy = A*Math.sin(Math.PI * 2 * H/12.0);
		double mx = B*Math.cos(Math.PI * 2 * M/60.0);
		double my = B*Math.sin(Math.PI * 2 * M/60.0);
		double L = Math.sqrt((hx-mx)*(hx-mx) + (hy-my)*(hy-my));
		System.out.println(L);
	}

}
