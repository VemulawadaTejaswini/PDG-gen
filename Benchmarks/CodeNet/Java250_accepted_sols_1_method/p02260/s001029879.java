import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int N = sc.nextInt();
        int[] x;
        x = new int[100];

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int minj = i;
            for (int j = i+1; j < N; j++) {
                if (x[minj] > x[j]) {
                    minj = j;
                }
            }

                if (minj != i) {
                    int temp = x[i];
                    x[i] = x[minj];
                    x[minj] = temp;
                    count++;
                }
        }

            for (int i = 0; i < N - 1; i++) {
                System.out.print(x[i] + " ");
            }
            System.out.println(x[N - 1]);
            System.out.println(count);
    }
}
