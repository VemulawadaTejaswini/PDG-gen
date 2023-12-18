import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[m];

        for (int i=0; i<n; i++) {
            a[i] = sc.nextLong();
        }

        for (int i=0; i<m; i++) {
            b[i] = sc.nextLong();
        }
        int i=0;
        int j=0;
        int count=0;
        while (i<n||j<m) {
            if(i==n){
                k=k-b[j];
                j++;
            } else if(j==m){
                k=k-a[i];
                i++;
            } else {
                if(a[i]<b[j]) {
                    k=k-a[i];
                    i++;
                } else {
                    k=k-b[j];
                    j++;
                }
            }

            if(k>=0) {
                count++;
            } else {
                break;
            }
        }
        System.out.print(count);
    }
}