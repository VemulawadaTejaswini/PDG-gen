import java.io.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str, t[];
			int n = Integer.parseInt(br.readLine());
			Stack<String> s[] = new Stack[101];
			for(int i = 1;i <= n;i++) {
				s[i] = new Stack<String>();
			}
			while(!(str = br.readLine()).equals("quit")) {
				t = str.split(" ");
				if(t[0].equals("push"))
					s[Integer.parseInt(t[1])].push(t[2]);
				else if(t[0].equals("move"))
					s[Integer.parseInt(t[2])].push(s[Integer.parseInt(t[1])].pop());
				else
					System.out.println(s[Integer.parseInt(t[1])].pop());
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}