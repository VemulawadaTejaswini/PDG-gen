import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] ary = new long[100001];
        long total = 0;
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(sc.next());
            ary[num]++;
            total += num;
        }
        int q = Integer.parseInt(sc.next());
        for(int i=0; i<q; i++){
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            total -= b * ary[b];
            total += c * ary[b];
            ary[c] += ary[b];
            ary[b] = 0;
            System.out.println(total);
        }
    }
}