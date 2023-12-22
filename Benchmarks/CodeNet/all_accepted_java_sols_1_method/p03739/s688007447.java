import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }

        long cost_1 = 0L;
        long cost_2 = 0L;
        long sum_1 = 0L;
        long sum_2 = 0L;
        for (int i=0;i<n;i++) {
            sum_1 += a[i];
            sum_2 += a[i];
            if (i%2==0) {
                if (sum_1<=0) {
                    cost_1 += 1-sum_1;
                    sum_1 += 1-sum_1;
                }
                if (sum_2>=0) {
                    cost_2 += sum_2-(-1);
                    sum_2 -= sum_2-(-1);
                }
            } else { // i%2==1
                if (sum_1>=0) {
                    cost_1 += sum_1-(-1);
                    sum_1 -= sum_1-(-1);
                }
                if (sum_2<=0) {
                    cost_2 += 1-sum_2;
                    sum_2 += 1-sum_2;
                }
            }
        }
        System.out.println(Math.min(cost_1, cost_2));
    }
}