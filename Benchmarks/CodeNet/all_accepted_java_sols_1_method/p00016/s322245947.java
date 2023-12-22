import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int angle = 0, step;
	double x = 0, y = 0, radian;
	String[] input;
	while (scan.hasNext()) {
	    input = scan.nextLine().split(",");
	    if (input[0].equals("0") && input[1].equals("0")) {
		break;
	    }
	    step = Integer.parseInt(input[0]);
	    radian = Math.toRadians(angle);
	    x += step * Math.sin(radian);
	    y += step * Math.cos(radian);
	    angle += Integer.parseInt(input[1]);
	}
	System.out.println((int)x);
	System.out.println((int)y);
    }
}