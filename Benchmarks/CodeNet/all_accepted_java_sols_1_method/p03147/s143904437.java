import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        
        int n = std.nextInt();
        int[] hs = new int[n];
        for (int i = 0; i < n; i++) {
            hs[i] = std.nextInt();
        }

        int v = 0;
        int e = 0;

        for (int i = 0; i < n; i++) {
            int h = hs[i];
            v += h;
        }

        for (int i = 1; i < n; i++) {
            e += Math.min(hs[i], hs[i - 1]);
        }

        System.out.println(v - e);
    }
}
