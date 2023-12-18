import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for(int i = 0; i < q; i++) {
			int[]p0 = new int[2];
			int[]p1 = new int[2];
			int[]p2 = new int[2];
			int[]p3 = new int[2];
			p0[0] = scan.nextInt();
			p0[1] = scan.nextInt();
			p1[0] = scan.nextInt();
			p1[1] = scan.nextInt();
			p2[0] = scan.nextInt();
			p2[1] = scan.nextInt();
			p3[0] = scan.nextInt();
			p3[1] = scan.nextInt();
			int[]u = vec(p0, p1);
			int[]v = vec(p2, p3);
			if(dot(u, v) == 0) {
				System.out.println(1);
			}else if(u[0] * v[1] - u[1] * v[0] == 0) {
				System.out.println(2);
			}else {
				System.out.println(0);
			}
		}
	}
	static int norm(int[]p) {
		return p[0] * p[0] + p[1] * p[1];
	}
	static int[] vec(int[]p1, int[]p2) {
		int[]u = {p2[0] - p1[0], p2[1] - p1[1]};
		return u;
	}
	static int dot(int[]u, int[]v) {
		return u[0] * v[0] + u[1] * v[1];
	}
	static int cross(int[]u, int[]v) {
		return u[0] * v[1] + u[1] * v[0];
	}
}
