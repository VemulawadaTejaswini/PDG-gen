import java.awt.Container;
import java.util.*;
public class Main {
	Scanner sc = new Scanner (System.in);
	void run() {
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		while (sc.hasNext()) {
			double val = sc.nextDouble();
			min = Math.min(min, val);
			max = Math.max(max, val);
		}
		System.out.println((max-min));
		
	}
	public static void main(String[] args) {
		new Main().run();
	}
	
}