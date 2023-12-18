import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				double xa = sc.nextDouble();
				double ya = sc.nextDouble();
				double ra = sc.nextDouble();
				double xb = sc.nextDouble();
				double yb = sc.nextDouble();
				double rb = sc.nextDouble();
				double rab = Math.sqrt((xb - xa) * (xb - xa) + (yb - ya)
						* (yb - ya));
				if(ra+rb<rab) System.out.println("0");
                else if(ra>rb && ra-rb>rab) System.out.println("2");
                else if(rb>ra && rb-ra>rab) System.out.println("-2"); 
                else System.out.println("1");
			}
		}
	}
}