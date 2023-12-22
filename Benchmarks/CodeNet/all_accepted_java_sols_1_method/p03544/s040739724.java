import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        long[] ary = new long[100];

        ary[0] = 2;
        ary[1] = 1;

        for (int i = 2; i <= n; i++) {
            ary[i] = ary[i - 2] + ary[i - 1];
        }

        System.out.println(ary[n]);
    }
}
