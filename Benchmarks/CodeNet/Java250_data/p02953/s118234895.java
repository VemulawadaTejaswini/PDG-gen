import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] h = new long[n];
        long[] buff = new long[n];
        boolean f = true;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextLong();
            if (i>0) {
                if (h[i]<h[i-1]) {
                    long diff=h[i-1]-h[i];
                    if ( buff[i-1] !=0 || diff>1 ) f=false;
                    else buff[i]=1;
                }
                else if (h[i]==h[i-1]) buff[i]=buff[i-1];
            }
        }
        System.out.println(f ? "Yes" : "No");
    }
}