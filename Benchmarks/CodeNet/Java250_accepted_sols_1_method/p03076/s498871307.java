import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int max = 0;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int b = ((a[i] / 10) + 1) * 10;
            if (a[i] % 10 == 0) b -= 10;
            sum += b;
            max = Math.max(max, b - a[i]);
        }

        System.out.println(sum - max);

    }
}
