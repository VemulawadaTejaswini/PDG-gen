import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(N - 1);

        int[] test;
        test = new int[N];

        int tmp;
        int cnt = 0;

        for (int i = 0; i < 3; i++) {
            test[i] = sc.nextInt();
        }
        for (int s = 0; s < 2; s++) {
            for (int j = s + 1; j < 3; j++) {
                if (test[s] > test[j]) {
                    tmp = test[s];
                    test[s] = test[j];
                    test[j] = tmp;
                    cnt++;
                }
            }
        }
        for (int j = 0; j < N; j++) {
            System.out.println(test[j]);
        }
        System.out.println(cnt);

    }
}

