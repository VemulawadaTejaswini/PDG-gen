import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();


        int[] roadSum = new int[N];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            //a < b とする処理
            if (a > b) {
                int tmp = b;
                b = a;
                a = tmp;
            }
            roadSum[a]++;
            roadSum[b]++;

        }
        for (int i = 0; i < N; i++) {
            System.out.println(roadSum[i]);
        }
    }
}
