import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int ans = Integer.MAX_VALUE;

        for (int i = list[0]; i <= list[n - 1]; i++) {
            int part = 0;
            for (int v: list
                 ) {
                part += (v - i) * (v - i);
            }
            ans = Math.min(ans, part);
        }

        System.out.println(ans);
    }
}