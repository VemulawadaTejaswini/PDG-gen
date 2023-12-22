import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<String,Long> map = new HashMap<>();
        long ans = 0;
        for(int i = 0;i<n;i++){
            char[] tmp = sc.next().toCharArray();
            Arrays.sort(tmp);
            String key = String.valueOf(tmp);
            if(map.get(key) != null){
                ans += map.get(key);
                map.put(key,map.get(key) + 1);
            }else{
                map.put(key,1L);
            }
        }
        System.out.println(ans);
    }
}