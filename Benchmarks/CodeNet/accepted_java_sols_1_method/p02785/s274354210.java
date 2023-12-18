import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] h = new long[n];
        for(int i = 0 ; i < n ; i++ ){
            h[i] = sc.nextLong();
        }
        Arrays.sort(h);
        long s = 0;
        for(int i = 0 ; i < n - k ; i++ ){
            s += h[i];
        }
        System.out.println(s);
        sc.close();
    }
}