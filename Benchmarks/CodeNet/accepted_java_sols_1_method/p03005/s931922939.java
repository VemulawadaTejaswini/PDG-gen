import java.util.*;

public class Main {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = n-k;

        if(k <= 1) result = 0;

        System.out.println(result);
    }
}