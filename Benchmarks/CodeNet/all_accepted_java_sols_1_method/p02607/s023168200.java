import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        Arrays.setAll(array, i -> sc.nextInt());
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && array[i] % 2 == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}