import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            x ^= arr[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(x ^ arr[i]);
        }
        System.out.println(sb);
    }
}