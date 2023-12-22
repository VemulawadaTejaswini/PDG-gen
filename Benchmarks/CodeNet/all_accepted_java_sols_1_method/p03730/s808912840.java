import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int num = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        for (int i = 1; i <= num; i++) {
            int tmp = n * i;
            if (tmp % num == c) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
