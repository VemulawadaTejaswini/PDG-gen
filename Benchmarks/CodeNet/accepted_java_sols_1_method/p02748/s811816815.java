import java.util.Scanner;

/** ケーズデンキは神*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();

        int[] a = new int[A + 1];
        int[] b = new int[B + 1];

        int mina = Integer.MAX_VALUE / 2;
        int minb = Integer.MAX_VALUE / 2;

        for (int i = 1; i <= A; i++) {
            a[i] = sc.nextInt();
            mina = Math.min(a[i], mina);
        }
        for (int i = 1; i <= B; i++) {
            b[i] = sc.nextInt();
            minb = Math.min(b[i], minb);
        }

        int minSum = mina + minb;

        for(int i=0;i <M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c = sc.nextInt();
            
            minSum = Math.min(a[x] + b[y] - c, minSum);
        }
        sc.close();

        System.out.println(minSum);
    }

}
