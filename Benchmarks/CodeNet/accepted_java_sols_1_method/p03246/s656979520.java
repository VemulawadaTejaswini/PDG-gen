import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] v = new int[n];
        for(int i = 0; i < n; i++){
            v[i] = Integer.parseInt(sc.next());
        }
        
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i = 0; i < n/2; i++){
            map1.put(v[i*2], map1.getOrDefault(v[i*2], 0) +1);
            map2.put(v[i*2 +1], map2.getOrDefault(v[i*2 +1], 0) +1);
        }
        
        Set<Integer> keySet1 = map1.keySet();
        int maxKey1 = 0;
        int maxValue1 = 0;
        int secondValue1 = 0;
        for(int i : keySet1){
            if(map1.get(i) > maxValue1){
                maxKey1 = i;
                secondValue1 = maxValue1;
                maxValue1 = map1.get(i);
            }else if(map1.get(i) > secondValue1){
                secondValue1 = map1.get(i);
            }
        }
        
        Set<Integer> keySet2 = map2.keySet();
        int maxKey2 = 0;
        int maxValue2 = 0;
        int secondValue2 = 0;
        for(int i : keySet2){
            if(map2.get(i) > maxValue2){
                maxKey2 = i;
                secondValue2 = maxValue2;
                maxValue2 = map2.get(i);
            }else if(map2.get(i) > secondValue2){
                secondValue2 = map2.get(i);
            }
        }
        
        int ans;
        if(maxKey1 == maxKey2){
            ans = n - Math.max(maxValue1 + secondValue2, maxValue2 + secondValue1);
        }else{
            ans = n - maxValue1 - maxValue2;
        }
        
        System.out.println(ans);
    }
}