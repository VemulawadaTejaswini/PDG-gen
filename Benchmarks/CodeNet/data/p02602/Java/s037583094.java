import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
        }
        int b = n - k + 1;
        long[] c = new long[b];
        for (int i = 0; i < b; i++) {
            long tmp = a[i];
            for (int j = i; j < i + k - 1; j++) {
                tmp *= a[j + 1];
            }
            c[i] = tmp;
            if(i > 0 && c[i - 1] < c[i]) System.out.println("Yes");
            else if(i > 0 && c[i - 1] >= c[i]) {
                System.out.println("No");
            }
        }
    }
}