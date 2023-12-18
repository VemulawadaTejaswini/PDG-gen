import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  Deque<Integer> stack = new ArrayDeque<Integer>();
  Scanner in = new Scanner(System.in);
  while (in.hasNext()) {
	int car = in.nextInt();
	if (car == 0) {
	  System.out.println(stack.removeFirst());
	} else {
	  stack.addFirst(car);
	}
  }
}

}