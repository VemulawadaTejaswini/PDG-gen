import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		Stack s = new Stack();

		for(int i = 0; i < input.length; i++){

			int x = 0;
			int y = 0;

			switch(input[i]){

				case "+":
					y = s.pop();
					x = s.pop();
					s.push(x + y);
					break;
				case "-":
					y = s.pop();
					x = s.pop();
					s.push(x - y);
					break;
				case "*":
					y = s.pop();
					x = s.pop();
					s.push(x * y);
					break;
				default:
					s.push(Integer.parseInt(input[i]));

			}

		}

		System.out.println(s.pop());

	}

}

class Stack{

	public static int size = 0;
	private int[] array;

	public Stack(){

		array = new int[100];

	}

	public void push(int n){

		array[size] = n;
		size++;

	}

	public int pop(){

		size--;

		return array[size];

	}

}