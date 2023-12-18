import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += w[i];
        }

        int ans = sum;
        for (int i = 1; i <= n; i++) {
            int under = 0;
            for (int j = 0; j < i; j++) {
                under += w[j];
            }
            // System.out.printf("%s -> %s : %s = %s\n", i, under, sum - under,
            // Math.abs(sum - under - under));
            ans = Math.min(Math.abs(sum - under - under), ans);
        }

        System.out.println(ans);
    }

}
