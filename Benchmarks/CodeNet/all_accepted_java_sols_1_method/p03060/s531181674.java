import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] v = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(sc.next());
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] - c[i] > 0) {
                result += v[i] - c[i];
            }
        }

        System.out.println(result);
    }
}
