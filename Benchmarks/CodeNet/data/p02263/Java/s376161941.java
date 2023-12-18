import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException {
		final String[] expression = getExpression();
		
		final String answer = calclate(expression);
		System.out.println(answer);
	}
	
	public static String calclate(final String[] expression) {
		final Stack<String> stack = new Stack<String>();
		
		for (String term : expression) {
			
			if (isNumber(term)) {
				stack.push(term);
				
			} else {
				final int operand2 = Integer.parseInt(stack.pop());
				final int operand1 = Integer.parseInt(stack.pop());
				
				String result;
				if ("+".equals(term)) {
					result = String.valueOf(operand1 + operand2);
					
				} else if ("-".equals(term)) {
					result = String.valueOf(operand1 - operand2);
					
				} else {
					result = String.valueOf(operand1 * operand2);
				}
				stack.push(result);
			}
		}
		
		return stack.pop();
	}
	
	public static boolean isNumber(String term) {
		Pattern patternNum = Pattern.compile("-*[0-9]+");
		Matcher matcherNum = patternNum.matcher(term);
		
		return matcherNum.matches();
	}
	
	public static String[] getExpression() throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		final String[] expression = reader.readLine().split(" ");
		reader.close();
		
		return expression;
	}
}