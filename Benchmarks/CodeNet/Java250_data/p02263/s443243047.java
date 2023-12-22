import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> input = new LinkedList<String>();
		while(sc.hasNext()){
			input.addLast(sc.next());
		}
		
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while(!input.isEmpty()){
			String ops = input.poll();
			
			if("+".equals(ops)){
				final int a = stack.poll();
				final int b = stack.poll();
				stack.addFirst(b + a);				
			}else if("-".equals(ops)){
				final int a = stack.poll();
				final int b = stack.poll();
				stack.addFirst(b - a);
			}else if("*".equals(ops)){
				final int a = stack.poll();
				final int b = stack.poll();
				stack.addFirst(b * a);
			}else if("/".equals(ops)){
				final int a = stack.poll();
				final int b = stack.poll();
				stack.addFirst(b / a);
			}else{
				stack.addFirst(Integer.parseInt(ops));
			}
		}
		
		System.out.println(stack.poll());
		
	}
}