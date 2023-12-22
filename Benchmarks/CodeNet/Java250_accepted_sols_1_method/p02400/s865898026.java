import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()) {
	    String input = scan.nextLine();
	    String[] inputs = input.split(" ");
	    double r = Double.parseDouble(inputs[0]);
	    double pi = Math.PI;
	    double area = r * r * pi;
	    double circumference = 2 * r * pi;
	    System.out.println(String.format("%.6f", area) + " " +String.format("%.6f", circumference));
	}
    }
}