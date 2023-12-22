import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        int[] arr = new int[n];
        for (int i = 1; i < n; i++) {
            if (s.charAt(i-1) == 'A' && s.charAt(i) == 'C') arr[i]++;
            arr[i] += arr[i-1]; // plus curr value with prev 
        }

        for (int i = 0; i < q; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;

            System.out.println(arr[end] - arr[start]);
        }
    }
}