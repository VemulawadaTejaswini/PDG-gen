import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{

    public static void main(String args[]) throws IOException {
        BufferedReader ln = new BufferedReader(new InputStreamReader(System.in));
        String[] str = ln.readLine().split("\\s");

        Stack<Integer> que = new Stack<Integer>();
        int a = 0;
        int b = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("+")) {
                a = que.pop();
                b = que.pop();
                que.add(b + a);
                continue;
            }
            if (str[i].equals("-")) {
                a = que.pop();
                b = que.pop();
                que.add(b - a);
                continue;
            }
            if (str[i].equals("*")) {
                a = que.pop();
                b = que.pop();
                que.add(b * a);
                continue;
            }
            if (str[i].equals("/")) {
                a = que.pop();
                b = que.pop();
                que.add(b / a);
                continue;
            }
            que.push(Integer.parseInt(str[i]));
        }
        System.out.println(que.pop());
    }
}


