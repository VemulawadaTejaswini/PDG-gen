import java.util.Scanner;

public class AOJ0073 {
    public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);

	double x, h;
	double s, t1, t2;
	while (true) {
	    x = stdIn.nextInt();
	    h = stdIn.nextInt();
	    if (x == 0 && h == 0) break;

	    t1 = h * h + x * x / 4;
	    t2 = Math.sqrt(t1);
	    s = x * x + 2 * x * t2;
	    System.out.println(s);
	}
    }
}