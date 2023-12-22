import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fast = -1;
        int fastIndex = -1;
        int second = -1;

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            if (fast <=  n) {
                second = fast;
                fast = n;
                fastIndex = i;
            } else if (second < n) {
                second = n;
            }
        }

        for (int i = 0; i < N; i++) {
            if (i == fastIndex) {
                System.out.println(second);
            } else {
                System.out.println(fast);
            }
        }

    }
}