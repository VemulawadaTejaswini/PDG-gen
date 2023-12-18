import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        java.util.Arrays.sort(a);
        String out = "";
        for (int i = 0; i < n; i++) {
            out += a[i] + " ";
        }
        System.out.println(out.trim());
    }
}