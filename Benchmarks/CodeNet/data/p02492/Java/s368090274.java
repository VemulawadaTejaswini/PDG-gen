import java.io.*;
import java.util.*;

class Calculation {
	int add(int a, int b) {
		return a + b;
	}
	
	int sub(int a, int b) {
		return a - b;
	}
	
	int mul(int a, int b) {
		return a * b;
	}
	
	int div(int a, int b) {
		return a / b;
	}
	
}

class Main {
		public static void main(String[] args) throws IOException {
	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String str = input.readLine();
		String array[] = str.split(" ");
		
		int x[] = new int[2];
		x[0] = Integer.parseInt(array[0]);
		x[1] = Integer.parseInt(array[2]);
		String op = array[1];
		
		Calculation cal1 = new Calculation();
		Calculation cal2 = new Calculation();
		Calculation cal3 = new Calculation();
		Calculation cal4 = new Calculation();
		
		if 		(op == "+") { System.out.println(cal1.add(x[0],x[2])); }
		else if (op == "-") { System.out.println(cal2.sub(x[0],x[2])); }
		else if (op == "*") { System.out.println(cal3.mul(x[0],x[2])); }
		else if (op == "/") { System.out.println(cal4.div(x[0],x[2])); }
		else if (op == "?") { System.exit(0); }
	}
}