import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] point = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            point[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = K+1; i < N+1; i++) {
            if (point[i-K] < point[i]) {
                sb.append("Yes").append("\n");
            } else {
                sb.append("No").append("\n");
            }
        }
        System.out.println(sb);
    }
}