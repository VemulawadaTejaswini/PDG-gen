import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC067B - Snake Toy

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 1 <= k <=n <= 50
        int k = sc.nextInt();
        Integer[] l = new Integer[n];

        for (int i = 0; i < n ; i++) {
            l[i] = sc.nextInt();
        }

        Arrays.sort(l, Collections.reverseOrder());

        int max = 0;
        for (int i = 0; i < k; i++) {
            max += l[i];
        }

        System.out.println(max);
    }

}