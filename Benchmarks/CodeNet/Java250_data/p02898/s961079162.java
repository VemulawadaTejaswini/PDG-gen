import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int[] h = new int[N];

        for (int i = 0; i < N; i++) {

            h[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        System.out.println(upperIsOK(h, K));

    }

    public static int upperIsOK(int[] array, int K) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] >= K) {

                count++;
            }
        }

        return count;
    }

}