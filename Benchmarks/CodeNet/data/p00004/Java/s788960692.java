import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	double a, b, c, d, e, f, x, y;

	while (scan.hasNext()) {
	    a = scan.nextDouble();
	    b = scan.nextDouble();
	    c = scan.nextDouble();
	    d = scan.nextDouble();
	    e = scan.nextDouble();
	    f = scan.nextDouble();
	
	    x = (c*e - b*f)/(a*e - b*d);
	    y = (c*d - a*f)/(b*d - a*e);

	    System.out.println(x+" "+y);
	}
    }
}