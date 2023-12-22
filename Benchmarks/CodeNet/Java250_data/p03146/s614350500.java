import java.util.Scanner;

public class Main {

    private static int solve(int s) {
        boolean[] appeared = new boolean[1000000];
        int n = 1;

        while (!appeared[s]) {
            appeared[s] = true;
            n += 1;

            if (s % 2 == 0) {
                s = s / 2;
            } else {
                s = 3 * s + 1;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int ans = solve(s);

        System.out.println(ans);
    }
}
