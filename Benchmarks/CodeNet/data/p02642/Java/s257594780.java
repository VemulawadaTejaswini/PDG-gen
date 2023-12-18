import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                if (i == j) continue;

                if (a[i] % a[j] == 0) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(a.length - count);
    }
}
