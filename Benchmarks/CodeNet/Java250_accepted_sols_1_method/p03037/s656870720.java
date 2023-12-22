import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int left = 0;
        int right = N;
        for (int i = 0; i < M; i++) {
            left = Math.max(sc.nextInt(), left);
            right = Math.min(sc.nextInt(), right);
        }

        if (left <= right) {
            System.out.println(right - left + 1);
        } else {
            System.out.println(0);
        }
    }
}