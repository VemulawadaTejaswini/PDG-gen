import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        int N = Integer.parseInt(array[0]);
        int x = Integer.parseInt(array[1]);

        int[] a = new int[N];

        array = scanner.nextLine().split(" ");

        for (int i = 0; i < N; ++i) {
            a[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(a);

        for (int i = 0; i < N; ++i) {
            if (x < a[i]) {
                System.out.println(i);
                return;
            } else if (x == a[i]) {
                System.out.println(i + 1);
                return;
            } else {
                x -= a[i];
            }
        }
        System.out.println(N - 1);
    }
}