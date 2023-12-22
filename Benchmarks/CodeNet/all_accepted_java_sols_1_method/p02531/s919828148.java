import java.io.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str, t[];
			Stack<String> s = new Stack<String>();
			while(!(str = br.readLine()).equals("quit")) {
				t = str.split(" ");
				if(t.length==2)
					s.push(t[1]);
				else
					System.out.println(s.pop());
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}