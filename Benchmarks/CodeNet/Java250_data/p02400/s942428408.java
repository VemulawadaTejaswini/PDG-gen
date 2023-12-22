import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();

		System.out.printf("%.6f %.6f",r*r*Math.PI,2 * Math.PI*r);
	}
}