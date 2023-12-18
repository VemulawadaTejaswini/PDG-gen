import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	int n = Integer.parseInt(scan.nextLine());
	double x1, y1, x2, y2, x3, y3, a1, b1, c1, a2, b2, c2;
	double px, py, r;
	String[] input;
	for (int i = 0; i < n; i ++) {
	    input = scan.nextLine().split(" ");
	    x1 = Double.parseDouble(input[0]);
	    y1 = Double.parseDouble(input[1]);
	    x2 = Double.parseDouble(input[2]);
	    y2 = Double.parseDouble(input[3]);
	    x3 = Double.parseDouble(input[4]);
	    y3 = Double.parseDouble(input[5]);
	    a1 = 2 * (x2 - x1);
	    b1 = 2 * (y2 - y1);
	    c1 = x1 * x1 - x2 * x2 + y1 * y1 - y2 * y2;
	    a2 = 2 * (x3 - x1);
	    b2 = 2 * (y3 - y1);
	    c2 = x1 * x1 - x3 * x3 + y1 * y1 - y3 * y3;
	    px = (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
	    py = (c1 * a2 - c2 * a1) / (a1 * b2 - a2 * b1);
	    r = Math.sqrt((px - x1) * (px - x1) + (py - y1) * (py - y1));
	    System.out.print(String.format("%.3f", px) + " ");
	    System.out.print(String.format("%.3f", py) + " ");
	    System.out.println(String.format("%.3f", r));
	}
    }
}