import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        String ans = "YES";
        int cnt = 0;

        for (int i = 0; i < n; i++ ) {
            a[i] = sc.nextInt();
        }
        int[] b = Arrays.copyOf(a, n);
        Arrays.sort(b);

        for(int i = 0; i < n; i++ ){
            if (a[i] != b[i]) cnt++;
            if (cnt > 2) {
                ans = "NO";
                break;
            }
        }

        System.out.println(ans);
        
        sc.close();
    }
}