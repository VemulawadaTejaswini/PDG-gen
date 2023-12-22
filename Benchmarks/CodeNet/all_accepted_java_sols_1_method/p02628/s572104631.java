import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int p[] = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
        }

        Arrays.sort(p);
        int total = 0;
        for (int i = 0; i < k; i++) {
            total += p[i];
        }

        System.out.println(total);
    }
}