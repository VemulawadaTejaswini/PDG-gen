import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int h = in.nextInt();
		int m = in.nextInt();

		double x1 = (double)a * Math.sin(2.0*Math.PI*((double)h/12.0 + (double)m/60.0/12.0));
		double y1 = (double)a * Math.cos(2.0*Math.PI*((double)h/12.0 + (double)m/60.0/12.0));

		double x2 = (double)b * Math.sin(2.0*Math.PI*(double)m/60.0);
		double y2 = (double)b * Math.cos(2.0*Math.PI*(double)m/60.0);

		System.out.println(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
	}
}

