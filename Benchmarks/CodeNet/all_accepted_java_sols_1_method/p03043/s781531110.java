import java.io.*;
import java.util.*;


public class Main {
    static long mod = 1000000000+7;
    static long n,a,b,k;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        int n = sc.nextInt(), k = sc.nextInt();
        double ans = 0.0;
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int i=0;i<25;i++){
            tm.put(1<<i,i);
        }
        for(int i=1;i<=n;i++){
            if(i>=k) ans += 1.0;
            else{
                int upper = k%i==0?k/i:(k/i+1);
                Integer key = tm.ceilingKey(upper);
                int step = tm.get(key);
                double cur = Math.pow(0.5,step);
                ans += cur;
            }
        }
        ans = ans/((double) n);
        System.out.println(ans);
    }

}

