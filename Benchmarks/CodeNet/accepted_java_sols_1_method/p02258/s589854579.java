import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            max = Math.max(max, r-min);
            min = Math.min(min, r);
        }
        System.out.println(max);
    }
}