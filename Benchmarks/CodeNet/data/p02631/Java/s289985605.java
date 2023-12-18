import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];
        long allXOR = 0;
        for(int i=0;i<N;i++){
            a[i] = sc.nextLong();
            allXOR ^= a[i];
        }

        for(int i=0;i<N;i++) {
            System.out.println(allXOR ^ a[i]);
        }


    }

}
