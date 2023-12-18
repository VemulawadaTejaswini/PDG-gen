import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int X = sc.nextInt();
        final int[] m = new int[N];
        for (int i = 0; i < N; i++) m[i] = sc.nextInt();

        int total = m.length;

        int used = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            used += m[i];
            min = Math.min(min, m[i]);
        }
        total += (X - used) / min;

        System.out.println(total);
    }
}
