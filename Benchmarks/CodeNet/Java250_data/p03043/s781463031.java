import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        double p = 0, p_n;

        for (int i = 1; i <= n; i++) {
            int score = i;
            p_n = 1 / (double) n;
            while (true) {
                if (score >= k) {
                    break;
                }
                score *= 2;
                p_n *= 0.5;
            }
            p += p_n;
        }

        System.out.println(p);

        sc.close();
    }
}