import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = 1;
	while(scan.hasNext()) {
	    String input = scan.next();
	    if (input.equals("0")) {
		break;
	    }
	    System.out.println("Case " + count++ + ": " + input);
	}
    }
}