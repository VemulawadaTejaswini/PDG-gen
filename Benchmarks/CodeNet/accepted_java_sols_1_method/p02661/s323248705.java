import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);

        if(n % 2 == 1) {
            long min = a[n/2];
            long max = b[n/2];
            System.out.println(max-min+1);
        } else {
            long min1 = a[n/2-1];
            long min2 = a[n/2];
            long max1 = b[n/2-1];
            long max2 = b[n/2];
            System.out.println(max1+max2-min1-min2+1);
        }



    }



}