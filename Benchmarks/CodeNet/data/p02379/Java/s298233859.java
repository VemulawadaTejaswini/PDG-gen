import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		double x1, x2, y1, y2;
		double distance;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		x1 = Double.parseDouble(str.split(" ")[0]);
		y1 = Double.parseDouble(str.split(" ")[1]);
		x2 = Double.parseDouble(str.split(" ")[2]);
		y2 = Double.parseDouble(str.split(" ")[3]);
		// System.out.println((y1 - y2) * (y1 - y2) + (x1 - x2) * (x1 - x2));
		System.out.println( Math.sqrt((y1 - y2) * (y1 - y2) + (x1 - x2) * (x1 - x2)));
	}
}

