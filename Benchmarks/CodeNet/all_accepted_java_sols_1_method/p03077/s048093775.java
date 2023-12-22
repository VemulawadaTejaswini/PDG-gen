import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        //PrintWriter out = new PrintWriter(System.out);
        long N = sc.nextLong();
        long[] a = new long[5];
        for(int i=0;i<5;i++) a[i]=sc.nextLong();
        // {arrive at current stop, num of people transport per minute
        long v = N;
        for(long w:a) v = Math.min(v,w);
        long ans = N%v==0?N/v:(N/v+1);
        ans += 4;
        System.out.println(ans);
    }
}