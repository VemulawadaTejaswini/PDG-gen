import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = 2_000_000_010;
        int max = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dist = x+y;
            min = Math.min(min,dist);
            max = Math.max(max,dist);
        }

        System.out.println(max-min);
    }
}
