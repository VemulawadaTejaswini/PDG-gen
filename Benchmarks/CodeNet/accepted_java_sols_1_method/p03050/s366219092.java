import java.io.*;
import java.util.*;


public class Main {
    static long mod = 1000000000+7;
    static long n,a,b,k;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        n = sc.nextLong();
        HashSet<Long> div = new HashSet<>();
        for(long i=1;i*i<=n;i++){
            if(n%i==0){
                div.add(i);div.add(n/i);
            }
        }
        long ans= 0;
        HashSet<Long> res = new HashSet<>();
        for(long w:div){
            if(w==1) continue;
            long m = w-1;
            if(w*(n%m)==n) res.add(m);
        }
        for(long w:res) ans += w;
        System.out.println(ans);
    }
}

