import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] X = new long[N];
        long[] s = new long[N];
        for(int i=0;i<N;i++) {
            long cur = sc.nextLong();
            X[i]=cur;
            s[i]=cur;
        }
        Arrays.sort(s);
        long smaller = s[N/2-1];
        long bigger = s[N/2];
        for(int i=0;i<N;i++){
            long ans;
            if(X[i]<=smaller) ans=bigger;
            else ans = smaller;
            System.out.println(ans);
        }

    }
}