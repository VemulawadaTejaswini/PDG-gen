import java.util.Scanner;
import java.text.DecimalFormat;

public class Circle {
	public static void main(String[] args){
	DecimalFormat df1 = new DecimalFormat("0.000000");
	Scanner sc = new Scanner(System.in);
	double pi = Math.PI;
	int r = sc.nextInt();
	double area = (2*r*pi);
	double length = ( pi*r*r);
	System.out.println(df1.format(area) + " " + df1.format(length));
	}
}