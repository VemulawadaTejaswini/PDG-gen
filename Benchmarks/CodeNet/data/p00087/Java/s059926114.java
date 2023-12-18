
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	void run() {
		Scanner sc = new Scanner (System.in);
		while(sc.hasNext()) {
			String line = sc.nextLine();
			String[] elements = line.split(" ");
			LinkedList<Double> stack = new LinkedList<Double>();
			for(String element: elements) {
				if( element.equals("/") ) {
					double s = stack.removeLast();
					double f = stack.removeLast();
					double v = f / s;
					stack.addLast(v);
				}
				else if( element.equals("*") ) {
					double s = stack.removeLast();
					double f = stack.removeLast();
					double v = f * s;
					stack.addLast(v);
				}
				else if( element.equals("+") ) {
					double s = stack.removeLast();
					double f = stack.removeLast();
					double v = f + s;
					stack.addLast(v);
				}
				else if( element.equals("-") ) {
					double s = stack.removeLast();
					double f = stack.removeLast();
					double v = f - s;
					stack.addLast(v);
				}
				else stack.addLast(Double.parseDouble(element));
			}
			System.out.println(stack.removeLast());
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}