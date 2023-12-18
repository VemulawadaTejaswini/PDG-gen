package primeNumber;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		(new Main()).doit(in);
	}
	
	void doit(BufferedReader in) throws IOException{
		String str;
		Stack stack = new Stack(10);
		int tmp;
		while(null != (str = in.readLine())){
			tmp = Integer.parseInt(str);
			if(tmp!=0){
				stack.push(tmp);
			}else{
				System.out.println(stack.pop());
			}
		}
	}
	
	class Stack{
		int stack[], sp;
		
		Stack(int capacity){
			stack = new int[capacity];
		}
		
		void push(int item){
			stack[sp++] = item;
		}
		
		int pop(){
			return stack[--sp];
		}
	}
}