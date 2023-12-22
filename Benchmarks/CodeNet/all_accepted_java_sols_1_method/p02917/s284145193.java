import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n - 1];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        int[] a = new int[n];
        a[0] = b[0];
        a[a.length - 1] = b[b.length - 1];
        for (int i = 1; i < a.length - 1; i++) {
            a[i] = Math.min(b[i - 1], b[i]);
        }
        int result = 0;
        for (int i : a) {
            result += i;
        }
        System.out.println(result);
        sc.close();
    }
}