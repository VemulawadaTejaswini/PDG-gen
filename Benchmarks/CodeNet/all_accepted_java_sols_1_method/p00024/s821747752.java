import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	double v, y, n;
	while (scan.hasNext()) {
	    v = Double.parseDouble(scan.nextLine());
	    y = v * v / (2 * 9.8);
	    n = Math.ceil((y + 5) / 5);
	    System.out.println((int)n);
	}
    }
}