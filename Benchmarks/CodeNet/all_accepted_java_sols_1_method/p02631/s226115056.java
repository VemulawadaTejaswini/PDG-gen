import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        int[] out = new int[n];

        int xor = 0;
        for (int i = 1; i <  n; i++) {
            xor ^= a[i];
        }

        out[0] = xor;
        for (int i = 1; i < n; i++) {
            xor ^= a[i-1];
            xor ^= a[i];
            out[i] = xor;
        }

        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i]);
            String s = i == out.length - 1 ? "\n" : " ";
            System.out.print(s);
        }
    }
    
}