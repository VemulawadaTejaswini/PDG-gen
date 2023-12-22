import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        Map<Long,Long> map = new HashMap<>();
        for(long i = 1;i*i<=n;i++){
            if(n%i==0){
                map.put(i,n/i);
            }
        }
        Set<Long> set = map.keySet();
        long ans = 1001001001001L;
        for(Long e: set){
            long a = Math.abs(e-1)+Math.abs(map.get(e)-1);
            if(ans>a){
                ans = a;
            }
        }
        System.out.println(ans);
    }
}