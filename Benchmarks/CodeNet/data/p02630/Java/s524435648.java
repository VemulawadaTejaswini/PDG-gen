import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
        }
        int q = sc.nextInt();

        long[] b = new long[q];
        long[] c = new long[q];
        for(int i=0; i<q; i++) {
            b[i] = sc.nextLong();
            c[i] = sc.nextLong();
        }

        for (int i=0; i<q; i++) {
            for (int j=0; j<n; j++){
                if(a[j]==b[i]) {
                    long temp = a[j];
                    a[j] = c[i];
                    sum = sum + c[i] - temp;
                }
            }
            System.out.print(sum);
            System.out.print('\n');
        }
    }
}