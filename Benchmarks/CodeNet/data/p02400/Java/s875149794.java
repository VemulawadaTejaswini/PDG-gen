import java.util.Scanner;
import java.lang.Math;
import java.text.*;
public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = Integer.parseInt(scan.next());
		System.out.println(String.format("%6f",r*r*Math.PI)+" "+String.format("%6f",2*r*Math.PI));
	}

}