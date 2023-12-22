import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int x = sc.nextInt();
        for (int i = x;; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                break;
            }
        }

    }

    private boolean isPrime(int a) {
        for (int i = 2; i*i < a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
