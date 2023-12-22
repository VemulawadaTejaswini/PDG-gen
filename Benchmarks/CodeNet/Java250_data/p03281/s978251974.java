import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(solve(N));
    }

    private static int solve(int N) {
        int count = 0;

        for (int i=1; i<=N; i++) {
            if(check(i)) count++;
        }

        return count;
    }

    private static boolean check(int a) {
        if (a%2 == 0) return false;
        int p = 0;

        for (int i=1; i<=a; i++) {
            if (a%i == 0) p++;
        }


        return p == 8;
    }
}
