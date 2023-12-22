import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            sum += a[i];
        }
        int mid1 = (int)Math.ceil(sum / (double)n);
        int mid2 = (int)Math.floor(sum / (double)n);
        
        long cost1 = 0;
        long cost2 = 0;
        for (int i = 0; i < n; i++) {
            cost1 += (int)Math.pow((a[i] - mid1), 2);
            cost2 += (int)Math.pow((a[i] - mid2), 2);
        }
//        System.out.println(mid1 + " " + mid2);
//        System.out.println(cost1 + " " + cost2);
        System.out.println((cost1<cost2)?cost1:cost2);
    }
}
