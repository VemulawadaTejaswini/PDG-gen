import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] res = new long[n + 1];
        long[] arr = new long[n + 1];
        arr[0] = 1;
        long l = 1;
        for(int i = 1; i <= n; i++){
            arr[i] = (long)sc.nextInt();
            if(i >= k) {
                l /= arr[i - k];
            }
            l *= arr[i];
            res[i] = l;
        }
        for(int i = k + 1; i <= n; i++) {
            if (res[i] > res[i - 1])
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}