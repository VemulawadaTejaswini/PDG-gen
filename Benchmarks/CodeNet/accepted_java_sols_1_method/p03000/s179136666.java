import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int pos = 0;
        for (int i = 0; i < n; ++i) {
            pos += sc.nextInt();
            if (pos > x) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(n + 1);
    }
}