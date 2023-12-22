import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArray = br.readLine().split("\\s");

        Deque<Integer> que = new ArrayDeque<>();
        int a = 0;
        int b = 0;
        for (int i = 0; i < stringArray.length; i++) {
            switch (stringArray[i]) {
            case "+":
                a = que.pollFirst();
                b = que.pollFirst();
                que.addFirst(b + a);
                break;
            case "-":
                a = que.pollFirst();
                b = que.pollFirst();
                que.addFirst(b - a);
                break;
            case "/":
                a = que.pollFirst();
                b = que.pollFirst();
                que.addFirst(b / a);
                break;
            case "*":
                a = que.pollFirst();
                b = que.pollFirst();
                que.addFirst(b * a);
                break;
            default:
                que.addFirst(Integer.parseInt(stringArray[i]));
            }
        }
        System.out.println(que.pop());
    }
}