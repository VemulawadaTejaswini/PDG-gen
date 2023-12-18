import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];
        long[] s = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
            if(i==0) {
                s[i] = a[i];
            } else {
                s[i] = s[i-1] + a[i];
            }
        }

        long sum = s[n-1];
        long min = sum;
        for(int i=0; i<n-1; i++) {
            long left = s[i];
            long right = sum - s[i];
            min = Math.min(min, Math.abs(left - right));
        }
        System.out.println(min);

    }


}
