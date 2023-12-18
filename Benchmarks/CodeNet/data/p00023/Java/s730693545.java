import java.util.*;

public class Main {
	Scanner sc;

	void run() {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double r1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double r2 = sc.nextDouble();
			double d = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			if (d > r1+r2) 
				System.out.println(0);
			else {
				if (d > r1 && d > r2) 
					System.out.println(1);
				else if (d < r1-r2)
					System.out.println(2);
				else 
					System.out.println(-2);
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}