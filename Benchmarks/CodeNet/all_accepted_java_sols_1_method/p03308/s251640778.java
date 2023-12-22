import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        final int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            min = Math.min(min, a);
            max = Math.max(max, a);
        }

        System.out.println(max - min);
    }
}
