import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[201];

            for (int i = 1; i < 201; i++) {
                for (int j = 1; j <= i; j++) {
                    for (int k = j; j * k <= i; k++) {
                        if (j * k == i) {
                            if (j == k) {
                                a[i]++;
                            } else {
                                a[i] += 2;
                            }
                        }
                    }
                }
            }

            int sum = 0;
            for (int i = 1; i <= n; i += 2) {
                if (a[i] == 8) sum++;
            }

            System.out.println(sum);
        }
    }
}
