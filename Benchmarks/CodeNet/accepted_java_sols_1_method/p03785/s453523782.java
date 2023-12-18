import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        int count = 0;
        int start = 0;
        for (int i = 1; i < n; i++) {
            if (list[i] - list[start] > k) {
                count++;
                if (i == n - 1) {
                    count++;
                }
                start = i;
            } else if (i - start == c) {
                count++;
                start = i;
            }
        }
        if (start != n - 1) {
            count++;
        }

        System.out.println(count);
    }
}