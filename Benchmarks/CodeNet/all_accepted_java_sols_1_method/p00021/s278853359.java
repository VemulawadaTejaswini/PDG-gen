import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	double x1, x2, x3, x4, y1, y2, y3, y4;
	String[] input;
	double slopeAB, slopeCD;
	for (int i = 0; i < n; i++) {
	    input = scan.nextLine().split(" ");
	    x1 = Math.round(Double.parseDouble(input[0]) * 100000);
	    y1 = Math.round(Double.parseDouble(input[1]) * 100000);
	    x2 = Math.round(Double.parseDouble(input[2]) * 100000);
	    y2 = Math.round(Double.parseDouble(input[3]) * 100000);
	    x3 = Math.round(Double.parseDouble(input[4]) * 100000);
	    y3 = Math.round(Double.parseDouble(input[5]) * 100000);
	    x4 = Math.round(Double.parseDouble(input[6]) * 100000);
	    y4 = Math.round(Double.parseDouble(input[7]) * 100000);
	    slopeAB = (y1 - y2) * (x3 - x4);
	    slopeCD = (y3 - y4) * (x1 - x2);
	    if (slopeAB == slopeCD) {
		System.out.println("YES");
	    } else {
		System.out.println("NO");
	    }
	}
    }
}