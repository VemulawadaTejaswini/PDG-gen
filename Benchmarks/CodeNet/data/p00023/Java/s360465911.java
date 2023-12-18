import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			double xa = sc.nextDouble();
			double ya = sc.nextDouble();
			double ra = sc.nextDouble();
			double xb = sc.nextDouble();
			double yb = sc.nextDouble();
			double rb = sc.nextDouble();
			double dx = xa-xb;
			double dy = ya-yb;
			double distsq = dx * dx + dy * dy;
			double dist = Math.sqrt(distsq);
			if ((ra + rb) * (ra + rb) < distsq) {
				System.out.println(0);
				continue;
			}
			if (Math.abs(ra-rb) > dist) {
				if (ra < rb) {
					System.out.println(-2);
					continue;
				}else{
					System.out.println(2);
					continue;
				}
			}
			System.out.println(1);
		}
	}

}