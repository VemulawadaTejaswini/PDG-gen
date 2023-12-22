import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 1;
        for (int i = 0 ; i < n ; i++) cnt = Math.min(cnt + k , cnt * 2);
        System.out.println(cnt);
    }
}