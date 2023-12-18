import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            n = sc.nextInt();
            if (n == 0) break;

            int total = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                total += sc.nextInt();
                max = Math.max(max, sc.nextInt());
            }

            if (total <= max)
                System.out.println("Yes");
            else
                System.out.println("No");


        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}