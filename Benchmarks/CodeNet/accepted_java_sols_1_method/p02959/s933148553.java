
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n+1];
        long[] b = new long[n];
        for(int i=0;i<n+1;i++){
            a[i] = sc.nextLong();
        }
        for(int i=0;i<n;i++){
            b[i] = sc.nextLong();
        }
        long num = 0;
        for(int i=0;i<n;i++){
            if(a[i]>b[i]){
                a[i] -= b[i];
                num += b[i];
                b[i] = 0;
            }
            else{
                num += a[i];
                b[i] -= a[i];
                a[i] = 0;
            }
            if(b[i]>0){
                if(a[i+1]>b[i]){
                    a[i+1] -= b[i];
                    num += b[i];
                    b[i] = 0;
                }
                else{
                    num += a[i+1];
                    b[i] -= a[i+1];
                    a[i+1] = 0;
                }
            }
        }
        System.out.println(num);
    }
}