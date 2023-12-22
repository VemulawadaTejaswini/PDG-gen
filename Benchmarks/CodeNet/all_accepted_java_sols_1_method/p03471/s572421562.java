import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();

        for (int a = 0; a <= Math.min(N, Y/10000); a++) {
            for (int b = 0; b <= Math.min(N-a, (Y - 10000*a)/5000); b++) {
                int c = N - a - b;
                if (10000 * a + 5000 * b + 1000 * c == Y) {
                    System.out.println(a + " " + b + " " + c);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}