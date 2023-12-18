import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String S = sc.nextLine();

            Stack<Integer> B = new Stack<>();
            Stack<Integer> C = new Stack<>();

            B.push(0);
            C.push(0);

            boolean flag = true;
            for (int j = 0; j < 10; j++) {
                int A = Integer.parseInt(S.split(" ")[j]);

                if (A > B.peek()) {
                    B.push(A);
                } else if (A > C.peek()) {
                    C.push(A);
                } else {
                    flag = false;
                    break;
                }
            }
            System.out.println((flag)? "YES" : "NO");
        }
    }
}