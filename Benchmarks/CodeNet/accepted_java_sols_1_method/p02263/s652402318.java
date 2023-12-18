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
		LinkedList<String> rest = new LinkedList<String>();
		
		while(!input.isEmpty()){
			//System.out.println(input + " " + rest);
			final int a = Integer.parseInt(input.poll());
			if(input.isEmpty()){
				System.out.println(a);
				break;
			}
			
			final int b = Integer.parseInt(input.poll());
			final String ops = input.poll();
			
			if("+".equals(ops)){
				input.addFirst((a + b) + "");
				while(!rest.isEmpty()){
					input.addFirst(rest.poll());
				}
			}else if("-".equals(ops)){
				input.addFirst((a - b) + "");
				while(!rest.isEmpty()){
					input.addFirst(rest.poll());
				}
			}else if("*".equals(ops)){
				input.addFirst((a * b) + "");
				while(!rest.isEmpty()){
					input.addFirst(rest.poll());
				}
			}else if("/".equals(ops)){
				input.addFirst((a / b) + "");
				while(!rest.isEmpty()){
					input.addFirst(rest.poll());
				}
			}else{
				rest.addFirst(a + "");
				input.addFirst(ops);
				input.addFirst(b + "");
			}
		}
		
	}
}