import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int X = cin.nextInt();
        int[] m = new int[N];
        for (int i = 0; i < N; i++) {
            m[i] = cin.nextInt();
        }

        int x = X - m[0];
        int min = m[0];
        for (int i = 1; i < N; i++) {
            x -= m[i];
            min = Math.min(min, m[i]);
        }

        System.out.println(N + (x / min));
    }
}