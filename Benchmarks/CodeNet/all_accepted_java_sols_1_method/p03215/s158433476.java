import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int K = sc.nextInt();
        long[] a = new long[n+1];
        for(int i=1;i<=n;i++) a[i] = sc.nextLong();
        long[] sum = new long[n+1];
        for(int i=1;i<=n;i++) sum[i] = sum[i-1]+a[i];
        ArrayList<Long> cur = new ArrayList<>();
        ArrayList<Long> next = new ArrayList<>();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                cur.add(sum[j]-sum[i-1]);
            }
        }
        long ans = 0;
        for(int i=45;i>=0;i--){
            if(cur.size()<K) break;
            long now = (long) Math.pow(2,i);
            for(int j=0;j<cur.size();j++){
                if((cur.get(j)&now)>0) next.add(cur.get(j));
            }
            if(next.size()<K){
                next = new ArrayList<>();
            }else{
                cur = next;
                next = new ArrayList<>();
                ans += now;
            }
        }
        System.out.println(ans);
    }
}