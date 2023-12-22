import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC156C - Rally

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n];

        int[] ttl = new int[100];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            for (int j = 0; j < 100; j++) {
                ttl[j] += Math.pow(x[i] - j + 1, 2);
            }
        }

        int min =Integer.MAX_VALUE;
        for (int k = 0; k < 100; k++) {
            if (min > ttl[k]) min = ttl[k];
        }

        System.out.println(min);
    }
}