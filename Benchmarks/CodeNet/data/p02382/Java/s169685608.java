import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int [] x = new int [p];
		int [] y = new int [p];
		int sub = 0;
		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		double pmax = 0;
		for(int i = 0; i < p; i++) {
			x[i] = sc.nextInt();
		}
		
		for(int i = 0; i < p; i++) {
			y[i] = sc.nextInt();
		}
		for(int i = 0; i < p; i++) {
			sub = Math.abs(x[i] - y[i]);

			p1 += sub;
			p2 += sub * sub;
			p3 += sub * sub * sub;
			pmax = Math.max(pmax , sub);
		}
	    p2 = Math.sqrt(p2);
        p3 = Math.cbrt(p3);
		
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(pmax);
	}
}

