import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        long[] arr = new long[n];
        Arrays.fill(arr, k - q);
        for(int i = 0; i < q; i++) arr[Integer.parseInt(sc.next()) - 1]++;
        for(long a : arr) ans.append(a > 0 ? "Yes\n" : "No\n");
        System.out.println(ans);
    }
}
