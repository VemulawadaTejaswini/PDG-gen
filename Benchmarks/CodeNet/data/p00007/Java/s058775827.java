import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 100000;
        for (int i = 0; i < n; i++) {
            ans *= 1.05;
            if (ans % 1000 != 0) {
                ans = ans - ans % 1000 + 1000;
            }
        }
        System.out.println(ans);
    }
}
