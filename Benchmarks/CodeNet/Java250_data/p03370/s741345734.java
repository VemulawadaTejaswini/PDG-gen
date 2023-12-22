import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] m = new int[N];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            m[i] = sc.nextInt();
            X -= m[i];
            if (m[i] < min) {
                min = m[i];
            }
        }

        int num = X / min;

        System.out.println(num + N);

    }

}
