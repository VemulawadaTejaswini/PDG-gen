import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()) {
	    String input = scan.nextLine();
	    String[] inputs = input.split(" ");
	    int a = Integer.parseInt(inputs[0]);
	    String op = inputs[1];
	    int b = Integer.parseInt(inputs[2]);
	    if (op.equals("+")) {
		System.out.println(a+b);
	    } else if (op.equals("-")) {
		System.out.println(a-b);
	    } else if (op.equals("*")) {
		System.out.println(a*b);
	    } else if (op.equals("/")) {
		System.out.println(a/b);
	    } else if (op.equals("?")) {
		break;
	    }
	}
    }
}