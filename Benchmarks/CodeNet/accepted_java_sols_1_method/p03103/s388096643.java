import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        Map<Long,Long> map = new TreeMap<>();

        for(int i=0; i<n; i++){
           long a = sc.nextLong();
           long b = sc.nextLong();
            // (value,quantity)
           map.put(a, map.getOrDefault(a,0L) + b);
        }
        long ans = 0;
        long value = 0;

        for(Long price : map.keySet()){
            long quan = map.get(price);
            ans += quan;
            value += price * quan;
            if(ans >= m){
                value -= price * (ans - m);
                System.out.println(value);
                break;
            }
        }
    }
}