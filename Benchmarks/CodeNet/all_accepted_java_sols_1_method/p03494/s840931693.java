import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        /*
        int N = 6;
        int[] A = {382253568,723152896,37802240,379425024,404894720,471526144};
        */

        boolean even = true;

        int cnt = 0;

        while (true) {

            for (int i = 0; i < N; i++) {

                if (A[i] % 2 != 0) {
                    even = false;
                }

            }

            if (even) {
                for (int i = 0; i < N; i++) {
                    A[i] = A[i] / 2;
                }

                cnt++;

            } else {
                break;
            }
        }

        System.out.println(cnt);

    }

}
