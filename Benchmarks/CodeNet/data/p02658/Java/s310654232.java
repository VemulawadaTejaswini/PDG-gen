import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++) {
            a[i] = scan.nextLong();
            if(a[i] == 0){
                System.out.println(0);
                System.exit(0);
            }
        }
        Arrays.sort(a);
        long out = 1;
        for(int i = 0; i < n; i++) {
            out *= a[i];
            if(out > 1000000000000000000L) {
                System.out.println(-1);
                System.exit(0);
            }
        }
        System.out.println(out);
    }
}