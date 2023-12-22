import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }
        boolean ok = Arrays.stream(as)
                .filter(a -> a % 2 == 0)
                .allMatch(a -> a % 3 == 0 || a % 5 == 0);

        System.out.println(ok ? "APPROVED" : "DENIED");
    }
}