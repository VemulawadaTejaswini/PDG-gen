import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	double xa, xb, ya, yb, ra, rb, d;
	String[] input;
	for (int i = 0; i < n; i++) {
	    input = scan.nextLine().split(" ");
	    xa = Double.parseDouble(input[0]);
	    ya = Double.parseDouble(input[1]);
	    ra = Double.parseDouble(input[2]);
	    xb = Double.parseDouble(input[3]);
	    yb = Double.parseDouble(input[4]);
	    rb = Double.parseDouble(input[5]);
	    d = Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
	    /*
	    if (ra + rb < d) {
		System.out.println(0);
	    } else if (d < ra - rb) {
		System.out.println(2);
	    } else if (d < rb - ra) {
		System.out.println(-2);
	    }
	    */
	    if (d < ra - rb) {
		System.out.println("2");
	    } else if (d < rb - ra) {
		System.out.println("-2");
	    } else if (Math.abs(ra - rb) < d && d < ra + rb) {
		System.out.println("1");
	    } else if (d > ra + rb) {
		System.out.println("0");
	    }
	}
    }
}