import java.io.*;
import java.util.*;

class Circle {
	double area(double r) {
		return r*r*Math.PI;
	}
	
	double dia(double r) {
		return 2*r*Math.PI;
	}
	
}

class Main {
		public static void main(String[] args) throws IOException {
	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		String array[] = str.split(" ");
		double x[] = new double[array.length];
		for(int i=0; i<array.length; i++) {
			x[i] = Integer.parseInt(array[i]);
		}
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		
		double a = circle1.area(x[0]);
		double b = circle2.dia(x[0]);
		
		System.out.printf("%.5f %.5f\n", a,b);
		
	}
}