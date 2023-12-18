import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int k = 0; k < n; k++) {
            for (int i = 1; i < n; i++) {
                if (a[i-1] > a[i]) {
                    int buf = a[i-1];
                    a[i-1] = a[i];
                    a[i] = buf;
                }
            }
        }
        String out = "";
        for (int i = 0; i < n; i++) {
            out += a[i] + " ";
        }
        System.out.println(out.trim());
    }
}