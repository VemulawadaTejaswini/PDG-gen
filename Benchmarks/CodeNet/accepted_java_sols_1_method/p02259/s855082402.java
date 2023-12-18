import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] input = new int[N];
            for (int i = 0; i < N; i++) {
                input[i] = sc.nextInt();
            }
            int cnt = 0;

            //Bubble Sort
            boolean flag = true;
            while (flag) {
                flag = false;
                for (int i = N - 1; i > 0; i--) {
                    if (input[i] < input[i - 1]) {
                        int tmp = input[i];
                        input[i] = input[i - 1];
                        input[i - 1] = tmp;
                        cnt++;
                        flag = true;
                    }
                }
            }
            System.out.print(input[0]);
            for (int i = 1; i < N; i++) System.out.print(" " + input[i]);
            System.out.println();
            System.out.println(cnt);
        }
    }
}
