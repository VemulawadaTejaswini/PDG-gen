import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.nextLine().toCharArray();
        int n = S.length;

        for (int i = 0; i < (1 << n - 1); i++) {
            Queue<String> queue = new LinkedList<>();

            // char -> long
            long sum = (S[0] - '0');
            queue.add(String.valueOf(S[0]));
            for (int j = 0; j < n - 1; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += S[j + 1] - '0';
                    queue.add("+");
                } else {
                    sum -= S[j + 1] - '0';
                    queue.add("-");
                }
                queue.add(String.valueOf(S[j + 1]));
            }

            if (sum == 7) {
                while(!queue.isEmpty()) {
                    System.out.print(queue.remove());
                }
                System.out.print("=7");
                return;
            }
        }
    }
}
