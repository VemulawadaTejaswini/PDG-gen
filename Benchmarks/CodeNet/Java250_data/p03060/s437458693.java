import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] V = new int[N];
        int[] C = new int[N];
        int[] difference = new int[N];
        int max = 0;

        for (int i = 0; i < N; i++) {

            V[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {

            C[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {

            difference[i] = V[i]-C[i];

            if( difference[i] > 0 ) {

                max += difference[i];
            }
        }

        System.out.println(max);

        sc.close();
    }
}