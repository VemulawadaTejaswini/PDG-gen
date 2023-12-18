import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  Deque<Number> deque = new ArrayDeque<Number>(40);
  Scanner in2;
  while (in.hasNextLine()) {
	in2 = new Scanner(in.nextLine());
	while (in2.hasNext()) {
	  if (in2.hasNextInt()) {
		deque.addFirst(in2.nextInt());
	  } else {
		double val;
		double a = deque.removeFirst().doubleValue();
		double b = deque.removeFirst().doubleValue();
		switch (in2.next().charAt(0)) {
		case '-':
		  a = -a;
		case '+':
		  val = a + b;
		  break;
		case '/':
		  val = b / a;
		  break;
		case '*':
		  val = a * b;
		  break;
		default:
		  System.out.println("err");
		  val = 0.0;
		}
		deque.addFirst(val);
	  }
	}
	in2.close();
	if (deque.size() == 1) {
	  System.out.printf("%.6f", (
		  (Number) deque.removeFirst()).doubleValue());
	  System.out.println();
	}
  }
}
}