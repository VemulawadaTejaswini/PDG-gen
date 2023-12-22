import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s");
        Stack<Integer> q = new Stack<Integer>();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("+")) {
                q.add(q.pop() + q.pop());
                continue;
            }
            if (str[i].equals("-")) {
		int a1 = q.pop();
		int a2 = q.pop();
                q.add(a2 - a1);
                continue;
            }
            if (str[i].equals("*")) {
                q.add(q.pop() * q.pop());
                continue;
            }
            q.push(Integer.parseInt(str[i]));
        }
        System.out.println(q.pop());
    }
}

