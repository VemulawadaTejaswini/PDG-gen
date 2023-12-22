import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        int idx = 1;
        for (int i = 0 ; i < n ; i++) {
            if (a[i] != idx) {
                count++;
            } else {
                idx++;
            }
        }
        if (count == n) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }

}
