import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            if (n % i == 0 && n / i <= 9) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}

