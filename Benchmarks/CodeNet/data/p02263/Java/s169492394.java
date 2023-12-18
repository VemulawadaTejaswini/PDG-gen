import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader br = new BufferedReader(new FileReader("in1.txt"));
		// BufferedReader br = new BufferedReader(new FileReader("in2.txt"));
		String[] line = br.readLine().split(" ");
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		for (String s : line) {
			if (s.equals("+"))
				stack.push(stack.pop() + stack.pop());
			else if (s.equals("-"))
				stack.push(-stack.pop() + stack.pop());
			else if (s.equals("*"))
				stack.push(stack.pop() * stack.pop());
			else
				stack.push(Integer.parseInt(s));
		}
		
		System.out.println(stack.pop());
	}
}