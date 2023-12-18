import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans += array[i];
        }
        System.out.println(ans);
    }
}