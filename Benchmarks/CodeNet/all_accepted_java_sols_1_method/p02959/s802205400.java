import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        long hunteredNumber = 0;
        for (int i = 0; i < b.length; i++) {
            long left = Math.min(a[i], b[i]);
            long right = Math.min(a[i + 1], b[i] - left);
            a[i + 1] -= right;
            hunteredNumber += left + right;
        }
        System.out.println(hunteredNumber);
        sc.close();
    }
}