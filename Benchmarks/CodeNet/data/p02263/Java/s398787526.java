import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int top = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String[] array = r.readLine().split(" ");
		int[] stack = new int[array.length];


		for(int i = 0; i < array.length; i++){
			String temps = array[i];
			int x,y = 0;
			switch(temps){
				case "+":
					x = pop(stack);
					y = pop(stack);
					push(stack,y + x);
					break;
				case "-":
					x = pop(stack);
					y = pop(stack);
					push(stack,y - x);
					break;
				case "*":
					x = pop(stack);
					y = pop(stack);
					push(stack,y * x);
					break;
				default:
					push(stack,Integer.parseInt(temps));
					break;
			}
		}
		System.out.println(stack[top]);
	}

	public static void push(int[] stack,int num){
		top++;
		stack[top] = num;
	}

	public static int pop(int[] stack){
		return stack[top--];
	}


}