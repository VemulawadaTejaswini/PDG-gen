import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] lines = sc.nextLine().split(" ");
            Deque<Double> que = new ArrayDeque<>();
            Double a = 0.0;
            Double b = 0.0;
            for (String s:lines) {
                switch (s) {
                case "+":
                    a = que.pop();
                    b = que.pop();
                    que.push(b + a);
                    break;
                case "-":
                    a = que.pop();
                    b = que.pop();
                    que.push(b - a);
                    break;
                case "/":
                    a = que.pop();
                    b = que.pop();
                    que.push(b / a);
                    break;
                case "*":
                    a = que.pop();
                    b = que.pop();
                    que.push(b * a);
                    break;
                default:
                    que.push(Double.parseDouble(s));
                }
            }
            System.out.println(que.pop());
        }
    }
}
