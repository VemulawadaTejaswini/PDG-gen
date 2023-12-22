import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] > x)
                break;
            if (i == N - 1 && a[i] == x) {
                count++;
                break;
            } else if (i == N - 1) {
                break;
            } else {
                x = x - a[i];
                count++;
            }
        }
        System.out.println(count);
    }
}