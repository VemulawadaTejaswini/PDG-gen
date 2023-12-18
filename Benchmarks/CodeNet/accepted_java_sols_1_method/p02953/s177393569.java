import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextInt();
        }
        boolean ok = true;
        for (int i = h.length - 2; i >= 0; i--) {
            if (h[i] - h[i + 1] == 1) {
                h[i]--;
            } else if (h[i] > h[i + 1]) {
                ok = false;
            }
        }
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}