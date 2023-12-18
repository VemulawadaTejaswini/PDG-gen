import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(m - array[i]);
            m = array[i];
        }    
        sum += Math.abs(m);
        for (int i = 0; i < n; i++) {
            int ans = sum;
            if (i == 0) {
                ans -= Math.abs(array[0]);
                ans -= Math.abs(array[0] - array[1]);
                ans += Math.abs(array[1]);
                System.out.println(ans);
            } else if (i == n - 1) {
                ans -= Math.abs(array[n - 2] - array[n - 1]);
                ans -= Math.abs(array[n - 1]);
                ans += Math.abs(array[n - 2]);
                System.out.println(ans);
            } else {
                ans -= Math.abs(array[i - 1] - array[i]);
                ans -= Math.abs(array[i] - array[i + 1]);
                ans += Math.abs(array[i - 1] - array[i + 1]);
                System.out.println(ans);
            }
        }
    }
}
