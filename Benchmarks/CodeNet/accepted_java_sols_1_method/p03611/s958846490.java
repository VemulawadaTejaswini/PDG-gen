import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }else {
                map.put(a, 1);
            }
        }
        int ans = 0;

        for(int p : map.keySet()){
            int count = map.get(p);
            if(map.containsKey(p-1)){
                count += map.get(p-1);
            }
            if(map.containsKey(p+1)){
                count += map.get(p+1);
            }
            ans = Math.max(ans, count);
        }
        System.out.println(ans);
    }
}