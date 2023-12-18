import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int[] a = new int[n + 1];
        int[] b = new int[n + 1];
        for (int i = 0 ; i < n ; i++) {
            a[i + 1] = a[i];
            b[i + 1] = b[i];
            if (c[i] == 'W') {
                a[i + 1]++;
            } else {
                b[i + 1]++;
            }
        }
        int min = n + 3;
        for (int i = 0 ; i < n + 1 ; i++) {
            int lw = a[i] - a[0];
            int rr = b[n] - b[i];
            min = Math.min(min, Math.max(lw, rr));
        }
        System.out.println(min);
    }

}