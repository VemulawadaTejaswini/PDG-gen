import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[]) throws IOException{
	int i,a=0,b=0;
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        String[] s = d.readLine().split(" ");
	Stack<Integer> stk = new Stack<Integer>();
	
        for (i=0;i<s.length;i++) {
            if (s[i].equals("+")) {
                a = stk.pop();
                b = stk.pop();
                stk.push(b + a);
                continue;
            }
            if (s[i].equals("-")) {
                a = stk.pop();
                b = stk.pop();
                stk.push(b - a);
                continue;
            }
            if (s[i].equals("*")) {
                a = stk.pop();
                b = stk.pop();
                stk.push(b * a);
                continue;
            }
            if (s[i].equals("*")) {
                a = stk.pop();
                b = stk.pop();
                stk.push(b * a);
                continue;
            }
            stk.push(Integer.parseInt(s[i]));
        }
        System.out.println(stk.pop());
    }
}



