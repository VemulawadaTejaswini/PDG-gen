import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        long result = 0;
        int max = a[0];
        for(int i = 0; i < n; i++) {
            if (max <= a[i]) max = a[i];
            result += max - a[i];
        }
        System.out.println(result);
    }
}
