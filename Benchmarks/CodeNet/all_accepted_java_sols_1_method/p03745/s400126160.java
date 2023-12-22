import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1) {
            System.out.println(1);
            return;
        }
        long[] arr = new long[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int cnt = 0;
        long diff = 0;
        for(int i = 1; i < n; i++) {
            long temp = arr[i] - arr[i-1] ;
            if(temp == 0) continue;

            if(temp * diff < 0) {
                cnt++;
                diff = 0;
            }
            else
                diff = temp;
        }
        System.out.println(cnt + 1);
    }
}