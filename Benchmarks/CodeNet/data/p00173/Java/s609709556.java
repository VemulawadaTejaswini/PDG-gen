import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        final int N = 9;
        String[] name = new String[N];
        int[] hito = new int[N], kane = new int[N];

        for (int i = 0; i < N; i++) {
            name[i] = in.next();
            int a = in.nextInt(), b = in.nextInt();
            hito[i] = a + b;
            kane[i] = a * 200 + b * 300;
        }
        for (int i = 0; i < N; i++) {
            System.out.printf("%s %d %d\n", name[i], hito[i], kane[i]);
        }
    }
}