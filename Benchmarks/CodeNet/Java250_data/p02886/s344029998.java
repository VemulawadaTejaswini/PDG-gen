import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = Integer.parseInt(sc.next());
        }

        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += d[i] * d[j];
            }
        }

        System.out.println(sum);
        sc.close();
    }
}