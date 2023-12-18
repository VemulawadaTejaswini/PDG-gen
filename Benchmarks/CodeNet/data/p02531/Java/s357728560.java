import java.util.Scanner;
public class Main {
	static String[] in  = new String[1000];
	static String[] out = new String[1000];
	static int in_idx = 0;
	static int out_idx = 0;
	static int counter = 0;
	
	static void push(String color) {
		in[in_idx++] = color;
		counter = 0;
	}
	
	static void pop() {
		out[out_idx++] = in[in_idx - 1 - counter];
		counter++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			String order = stdIn.next();
			if(order.equals("push")) {
				String color = stdIn.next();
				push(color);
			} else if(order.equals("pop")) {
				pop();
			} else if(order.equals("quit")) {
				break;
			}
		}
		for(int r = 0; r < out_idx; r++) {
			System.out.println(out[r]);
		}
	}
}