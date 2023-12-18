
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max += (a[i] - (-100))*(a[i]-(-100));
        }
        int min=max;
        for (int i = -100; i <101 ; i++) {
            int sum=0;
            for (int j = 0; j <n ; j++) {
                sum+=(a[j] - (i))*(a[j]-(i));


            }
            if (sum<min) {
                min=sum;
            }
        }
        System.out.println(min);

    }
}