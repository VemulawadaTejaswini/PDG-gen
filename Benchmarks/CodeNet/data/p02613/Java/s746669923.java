
import java.util.*;
import java.lang.*;

public class Solution {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Map<String,Integer> map = new TreeMap<>();
            map.put("AC",0);
            map.put("WA",0);
            map.put("TLE",0);
           map.put("RE",0) ;
            while(n-->0){
                String s = sc.next();
                if(map.containsKey(s)){
                    map.put(s,map.get(s) + 1);
                }
            }
            for(Map.Entry<String,Integer> var : map.entrySet()){
                System.out.println(var.getKey()+" x "+var.getValue());
            }
    }
}