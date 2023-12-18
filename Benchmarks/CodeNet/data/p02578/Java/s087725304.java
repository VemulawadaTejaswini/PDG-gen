import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int result = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max <= a[i]) max = a[i];
            result += max - a[i];
        }
        System.out.println(result);
    }
}
