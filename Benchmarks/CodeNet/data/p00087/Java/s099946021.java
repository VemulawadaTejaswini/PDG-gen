import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		Map<String, Operation> operations = new HashMap<String, Operation>();
		operations.put("+", new Add());
		operations.put("-", new Subtract());
		operations.put("*", new Multiply());
		operations.put("/", new Divide());

		Stack<Double> stack = new Stack<Double>();
		String line;
		while(true) {
			line = sc.readLine();
			if(line == null) {break;}
			
			for(String str : line.split(" ")) {
				if(operations.containsKey(str)) {
					operations.get(str).calc(stack);
				} else {
					stack.push(Double.valueOf(str));
				}
			}
			System.out.println(stack.pop());
		}
	}
}

interface Operation {
	void calc(Stack<Double> stack);
}
class Add implements Operation {
	public void calc(Stack<Double> stack) {
		double b = stack.pop().doubleValue();
		double a = stack.pop().doubleValue();
		stack.push(Double.valueOf(a + b));
	}
}
class Subtract implements Operation {
	public void calc(Stack<Double> stack) {
		double b = stack.pop().doubleValue();
		double a = stack.pop().doubleValue();
		stack.push(Double.valueOf(a - b));
	}
}
class Multiply implements Operation {
	public void calc(Stack<Double> stack) {
		double b = stack.pop().doubleValue();
		double a = stack.pop().doubleValue();
		stack.push(Double.valueOf(a * b));
	}
}
class Divide implements Operation {
	public void calc(Stack<Double> stack) {
		double b = stack.pop().doubleValue();
		double a = stack.pop().doubleValue();
		stack.push(Double.valueOf(a / b));
	}
}