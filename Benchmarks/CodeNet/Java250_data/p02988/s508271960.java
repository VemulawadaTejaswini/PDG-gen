import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int[] p = new int[n];
        for (int i = 0; i < p.length; i++)
            p[i] = sc.nextInt();
        for (int i = 0; i <= n - 3; i++) {
            int max = p[i];
            if (max < p[i + 1])
                max = p[i + 1];
            if (max < p[i + 2])
                max = p[i + 2];
            int min = p[i];
            if (min > p[i + 1])
                min = p[i + 1];
            if (min > p[i + 2])
                min = p[i + 2];
            if (p[i + 1] == (p[i] + p[i + 1] + p[i + 2] - max - min))
                count++;
        }
        System.out.println(count);
    }
}
