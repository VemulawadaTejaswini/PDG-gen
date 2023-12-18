import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Scanner sc = new Scanner(System.in);
        int cap;

        int n = sc.nextInt();

        while(n-- > 0){
            cap = sc.nextInt();
            if(!map.containsKey(cap)) map.put(cap, 1);
            else map.put(cap, map.get(cap) + 1);
        }

        int ans = 0;

        for(int key: map.keySet()){
            if(map.get(key) < key) ans += map.get(key);
            else ans += map.get(key) - key;
        }

        System.out.println(ans);
    }

}