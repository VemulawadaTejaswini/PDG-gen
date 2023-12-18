import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()) {
	    String input = scan.nextLine();
	    String[] inputs = input.split(" ");
	    int x = Integer.parseInt(inputs[0]);
	    int y = Integer.parseInt(inputs[1]);
	    if (x == 0 && y == 0) {
		break;
	    }
	    if (x < y) {
		System.out.println(x + " " + y);
	    } else {
		System.out.println(y + " " + x);
	    }
	}
    }
}