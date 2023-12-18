import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        long[] xx = new long[n];
        long[] yy = new long[m];
        for (int i=0;i<n;i++) {
            xx[i] = Long.parseLong(sc.next());
        }
        for (int i=0;i<m;i++) {
            yy[i] = Long.parseLong(sc.next());
        }
        long[] x = new long[n-1];
        long[] y = new long[m-1];
        for (int i=0;i<n-1;i++) {
            x[i]=xx[i+1]-xx[i];
        }
        for (int i=0;i<m-1;i++) {
            y[i]=yy[i+1]-yy[i];
        }
        int mod = 1_000_000_007;
        long x_sum = 0L;
        long tmp_x=n-1;
        long add_x=n-1;
        for (int i=0;i<n-1;i++) {
            if (i<(n-1)/2) {
                if (i!=0) {
                    add_x-=2;
                    tmp_x+=add_x;
                }
                x_sum = (x_sum+tmp_x*x[i])%mod;
            } else {
                if ((n-1)%2==0 && i==(n-1)/2) {
                } else if (i==(n-1)/2){
                    add_x-=2;
                    tmp_x+=add_x;
                } else {
                    if (i!=(n-1)/2+1) {
                        add_x+=2;
                    }
                    tmp_x-=add_x;
                }
                x_sum = (x_sum+tmp_x*x[i])%mod;
            }
        }
        long y_sum = 0L;
        long tmp_y=m-1;
        long add_y=m-1;
        for (int i=0;i<m-1;i++) {
            if (i<(m-1)/2) {
                if (i!=0) {
                    add_y-=2;
                    tmp_y+=add_y;
                }
                y_sum = (y_sum+tmp_y*y[i])%mod;
            } else {
                if ((m-1)%2==0 && i==(m-1)/2) {
                } else if(i==(m-1)/2){
                    add_y-=2;
                    tmp_y+=add_y;
                } else {
                    if (i!=(m-1)/2+1) {
                        add_y+=2;
                    }
                    tmp_y-=add_y;
                }
                // System.out.println("y: " + tmp_y);
                y_sum = (y_sum+tmp_y*y[i])%mod;
            }
        }
        // System.out.println(x_sum + " " + y_sum);
        if (n==2 && m==2) {
            System.out.println(x[0]*y[0]);
        } else {
            System.out.println(x_sum*y_sum%mod);
        }
    }
}