import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        TreeMap<Integer,Long> map = new TreeMap<Integer,Long>();
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(sc.next());
            long b = Long.parseLong(sc.next());
            if(map.containsKey(a)){
                map.put(a,map.get(a)+b);
            }else{
                map.put(a,b);
            }
        }
        long idx = 0; 
        for(int key:map.keySet()){
            idx += map.get(key);
            if(idx>=k){
                System.out.println(key);
                return;
            }
        }
        return;
    }
}