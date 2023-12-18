
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        double arr[] = new double[n+(k-1)];
        double aveArr[] = new double[n+(k-1)];

        int cnt = 0;
        double now = 0.0;
        double max = 0.0;

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            double ki = (p+1.0)/2.0;
            arr[i] = ki;
            cnt++;
            now += ki;
            if (cnt > k) {
                now -= arr[i - k];
            }
            if (now > max) max = now;
        }

        System.out.println(max);
    }
}