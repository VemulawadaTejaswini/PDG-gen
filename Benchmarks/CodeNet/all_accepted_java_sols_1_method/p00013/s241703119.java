import java.util.ArrayDeque;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
	int n;
	while (scan.hasNext()) {
	    n = Integer.parseInt(scan.nextLine());
	    if (n == 0) {
		System.out.println(stack.pop());
	    } else {
		stack.push(n);
	    }
	}
    }
}