import java.io.*;
import java.util.*;
import java.math.*;

class Circle {
	double area(int r) {
		return r*r*Math.PI;
	}
	
	double dia(int r) {
		return 2*r*Math.PI;
	}
	
}

class Main {
		public static void main(String[] args) throws IOException {
	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		String array[] = str.split(" ");
		int x[] = new int[array.length];
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