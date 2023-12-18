import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];
        long[] s = new long[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);

        for(int i = 0; i < n; i++) {
            s[i] = a[i];
            if(i > 0) s[i] += s[i - 1];
        }
        int count = 1;

        for(int i = n - 2; i >= 0; i--) {
            if(s[i] * 2 >= a[i + 1]) count++;
            else break;
        }

        System.out.println(count);
    }
}