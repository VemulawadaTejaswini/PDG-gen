import java.util.*;
public class Main {
    public static void main(String[] args) throws NumberFormatException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int prev = sc.nextInt();
        int min = prev;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < N; i++) {
            int n = sc.nextInt();
            min = Math.min(min, prev);
            max = Math.max(n - min, max);

            prev = n;
        }

        System.out.println(max);
    }
}

