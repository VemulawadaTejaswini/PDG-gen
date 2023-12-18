import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n-- > 0) {
			double xa = scan.nextDouble();
			double ya = scan.nextDouble();
			double ra = scan.nextDouble();
			double xb = scan.nextDouble();
			double yb = scan.nextDouble();
			double rb = scan.nextDouble();
			
			double ab = Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
			
			if (ab > ra + rb) {
				System.out.println(0);
			}else if (ra > ab + rb) {
				System.out.println(2);
			}else if (rb > ab + ra) {
				System.out.println(-2);
			}else {
				System.out.println(1);
			}
		}
	}
	
	private void debug() {
		System.out.println();
	}

}