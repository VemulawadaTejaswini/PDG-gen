import java.util.Scanner;
import java.lang.Math;
import java.text.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = Double.parseDouble(scan.next());
		System.out.println(String.format("%6f",r*r*Math.PI)+" "+String.format("%6f",2*r*Math.PI));
		scan.close();
	}

}