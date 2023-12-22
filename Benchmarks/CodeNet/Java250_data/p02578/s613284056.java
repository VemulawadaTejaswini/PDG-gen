import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long count = 0;
        int base = 0;
        int now = sc.nextInt();
        for (int i = 0; i < N-1; i++) {
            int Ai = sc.nextInt();
            base = Ai;
            if (Ai < now) {
                base = now;
                count += (now-Ai);
            }
            now = base;
        }
        System.out.println(count);
    }
}