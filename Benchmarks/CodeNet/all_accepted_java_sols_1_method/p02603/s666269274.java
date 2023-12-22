import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        long v = 1000;
        long s = 0;
        for(int i=0; i<n; i++) {
            if(i==n-1) {
                v += s * a[i];
                break;
            }
            if(a[i]<a[i+1]) {
                long num = v / a[i];
                s += num;
                v -= num * a[i];
            } else if (a[i]>a[i+1]) {
                v += s * a[i];
                s = 0;
            }
        }
        System.out.println(v);
    }




}