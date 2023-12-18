import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArray = br.readLine().split("\\s");

        Stack<Integer> que = new Stack<Integer>();
        int a = 0;
        int b = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals("+")) {
                a = que.pop();
                b = que.pop();
                que.add(b + a);
                continue;
            }
            if (stringArray[i].equals("-")) {
                a = que.pop();
                b = que.pop();
                que.add(b - a);
                continue;
            }
            if (stringArray[i].equals("*")) {
                a = que.pop();
                b = que.pop();
                que.add(b * a);
                continue;
            }
            if (stringArray[i].equals("/")) {
                a = que.pop();
                b = que.pop();
                que.add(b / a);
                continue;
            }
            // 演算子以外はstackに登録する
            que.push(Integer.parseInt(stringArray[i]));
        }
        System.out.println(que.pop());
    }
}