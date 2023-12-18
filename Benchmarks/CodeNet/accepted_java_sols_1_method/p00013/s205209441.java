import java.io.*;
import java.util.Stack;

public class Main {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s;
			Stack<Integer> a = new Stack<Integer>();
			while((s = reader.readLine()) != null) {
				int x = Integer.parseInt(s);
				if(x>0 && x<=10)
					a.push(x);
				else
					System.out.println(a.pop());
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}