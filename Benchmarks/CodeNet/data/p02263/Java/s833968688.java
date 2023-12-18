import java.io.*;

class Stack{
	private int[] StackArray;
	private final int maxSize = 100;
	private int top;
	
	public Stack(){
		StackArray = new int[maxSize];
		top = -1;
	}
	public int pop(){
		return StackArray[top--];
	}
	public void push(int o){
		StackArray[++top] = o;
	}
	public int peak(){
		return StackArray[top];
	}
}

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] op = br.readLine().split(" ");
		Stack st = new Stack();
		
		for(int i = 0;i<op.length;i++){
			char ch = op[i].charAt(0);
			int a,b;
			switch(ch){
				case '+':
					a = st.pop();
					b = st.pop();
					st.push(b+a);
					break;
				case '-':
					a = st.pop();
					b = st.pop();
					st.push(b-a);
					break;
				case '*':
					a = st.pop();
					b = st.pop();
					st.push(b*a);
					break;
				case '/':
					a = st.pop();
					b = st.pop();
					st.push(b/a);
					break;
				default:
					st.push(Integer.parseInt(""+op[i]));
					break;
			}
		}
		System.out.println(st.peak());
	}
}