import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int t = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            t = f(i);
            if (t >= a && t <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    private static int f(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i = i / 10;
        }
        return sum;
    }
}