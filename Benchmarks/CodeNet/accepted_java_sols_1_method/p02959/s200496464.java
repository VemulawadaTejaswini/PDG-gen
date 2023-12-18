import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];
        for(int i = 0;i<a.length;i++) {
            a[i] = stdIn.nextInt();
        }
        for(int i = 0;i<b.length;i++) {
            b[i] = stdIn.nextInt();
        }
        long count = 0;
        for(int i = 0;i<b.length;i++) {
            if(a[i]>=b[i]) {
                count += b[i];
                a[i] -= b[i];
                b[i]  = 0;
            } else {
                count += a[i];
                b[i] -= a[i];
                a[i] = 0;
            }
            if(a[i+1]>=b[i]) {
                count += b[i];
                a[i+1] -= b[i];
                b[i] = 0;
            } else {
                count += a[i+1];
                b[i] -=a[i+1];
                a[i+1] = 0;
            }
        }
        System.out.println(count);
    }
}