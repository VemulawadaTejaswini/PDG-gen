import java.io.*;
import java.util.*;

class Calc {
	int add(int a, int b) {
		return a + b;
	}
	
	int rem(int a, int b) {
		return a % b;
	}
	
	double div(double a, double b) {
		return a / b;
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
		
		Calc calc1 = new Calc();
		Calc calc2 = new Calc();
		Calc calc3 = new Calc();
		
		int a = calc1.add(x[0], x[1]);
		int b = calc2.rem(x[0], x[1]);
		double c = calc3.div(x[0], x[1]);
		
		System.out.printf("%d %d %.5f\n", a,b,c);
		
	}
}