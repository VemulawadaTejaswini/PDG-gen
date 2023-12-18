import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        long a = sc.nextLong();

        for (int i = 1; i < n; i++) {
            a *= sc.nextLong();
        }
        if (a < 0 || a > 1000000000000000000L) {
            System.out.println(-1);
            return;
        }
        System.out.println(a);
    }
}
