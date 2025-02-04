import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created on 2016/08/13.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<N; i++){
            int tmp = sc.nextInt();
            if(map.containsKey(tmp)){
                int val = map.get(tmp);
                val++;
                map.put(tmp, val);
            }else{
                map.put(tmp, 1);
            }
        }

        Set<Integer> keys = map.keySet();

        int tmpCost = Integer.MAX_VALUE;
        int ans = -1;

        for(int key=-101; key<101; key++){
            int cost = 0;
            for(int key2: keys){
                int cnt = map.get(key2);
                cost += ((key - key2) * (key - key2)) * cnt;
            }
            if(cost < tmpCost){
                tmpCost = cost;
                ans = key;
            }
        }

        System.out.println(tmpCost);
    }
}
