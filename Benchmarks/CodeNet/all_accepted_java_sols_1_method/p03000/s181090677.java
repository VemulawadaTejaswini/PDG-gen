import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()), x = Integer.parseInt(sc.next());
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(sc.next());
        }
        int prevD = 0;
        int result = 1;
        while (result != n + 1) {
            int d = prevD + l[result - 1];
            if (d > x) {
                break;
            }
            prevD = d;
            result++;
        }

        System.out.println(result);
    }
}
