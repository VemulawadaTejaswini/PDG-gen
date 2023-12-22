import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n - 1; i++) {
            int tmp = sc.nextInt();
            a[tmp]++;
        }
        for (int i = 1; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}