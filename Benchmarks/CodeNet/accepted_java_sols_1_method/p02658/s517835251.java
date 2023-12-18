import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long max = (long) Math.pow(10, 18);

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] == 0) {
                a[0] = 0; break;
            }
        }
        long ans = a[0];

        for (int i = 1; i < n; i++) {
            if(ans==0) break;
            if (max / ans < a[i]){
                ans= -1; break;
            } 
            ans*=a[i];
        }
        System.out.println(ans);
    }
}