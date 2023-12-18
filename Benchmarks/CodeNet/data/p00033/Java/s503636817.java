import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        for (int i = 0; i < N; i++) {
            Stack<Integer> B = new Stack<>();
            Stack<Integer> C = new Stack<>();

            boolean flag = true;
            for (int j = 0; j < 10; j++) {
                int ball = Integer.parseInt(sc.next());

                if (B.empty()) {
                    B.push(ball);
                } else if (C.empty()) {
                    C.push(ball);
                } else {
                    if (B.peek() < ball) {
                        B.push(ball);
                    } else if (C.peek() < ball) {
                        C.push(ball);
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            System.out.println((flag)? "YES" : "NO");
        }
    }
}