import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            if (i % 2 == 1 && a % 2 == 1) res++;
        }
        System.out.println(res);
    }
}