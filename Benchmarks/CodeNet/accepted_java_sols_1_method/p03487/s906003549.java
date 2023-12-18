import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Long,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            long k = sc.nextLong();
            if(map.containsKey(k)){
                map.put(k,map.get(k) + 1);
            }else{
                map.put(k,1);
            }
        }
        int ans = 0;
        for(Map.Entry<Long,Integer> e : map.entrySet()){
            long k = e.getKey();
            int v = e.getValue();
            if(v - k >= 0){
                ans += v-k;
            }else{
                ans += v;
            }
        }
        System.out.println(ans);
    }
}