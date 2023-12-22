import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC067B - Snake Toy

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 1 <= k <=n <= 50
        int k = sc.nextInt();
        int[] l = new int[n];

        for (int i = 0; i < n ; i++) {
            l[i] = sc.nextInt();
        }

        Arrays.sort(l);

        int max = 0;
        for (int i = n - 1; i >= n - k; i--) {
            max += l[i];
        }

        System.out.println(max);
    }

}