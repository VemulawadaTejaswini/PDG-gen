import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int A = sc.nextInt();
        final int B = sc.nextInt();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= 1000; i++) {
            if (Math.floor(i * 0.08) == A && Math.floor(i * 0.1) == B) {
                min = Math.min(min, i);
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }
}
