import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(sc.next());
        }
        for (int i = n - 1; i > 0; i--) {
            if (h[i] < h[i - 1]) {
                h[i - 1]--;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (h[i] > h[i + 1]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}