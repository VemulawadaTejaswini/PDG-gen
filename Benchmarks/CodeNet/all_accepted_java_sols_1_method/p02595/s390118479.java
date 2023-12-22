import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        int kaunto = 0;
        long[] a = new long[n];
        long[] b = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
            if(a[i]*a[i] + b[i]*b[i] <= d*d) kaunto++;
        }
        System.out.println(kaunto);
        sc.close();
    }
}