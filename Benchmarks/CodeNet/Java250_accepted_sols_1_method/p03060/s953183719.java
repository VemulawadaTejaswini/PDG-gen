import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int v[] = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            int c = in.nextInt();

            if (v[i] > c) {
                total += v[i] - c;
            }
        }

        System.out.println(total);
    }
}
