import java.util.*;
import java.math.*;

public class Main {
    public static void main (String [] args) {
	Scanner in = new Scanner(System.in);

	double x1 = in.nextDouble(), y1 = in.nextDouble();
	double x2 = in.nextDouble(), y2 = in.nextDouble();

	double dist = Math.pow(x2-x1,2.0) + Math.pow(y2-y1,2.0);
	System.out.println(Math.sqrt(dist));
    }
}