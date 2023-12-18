import java.util.Stack;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		Stack<Integer> s = new Stack<Integer>();
		while (null != (str = in.readLine())){
			doit(Integer.parseInt(str),s);
		}
	}
	
	private static void doit(int n,Stack<Integer> s){
		if(n==0)
			System.out.println(s.pop());
		else s.push(n);
	}

}