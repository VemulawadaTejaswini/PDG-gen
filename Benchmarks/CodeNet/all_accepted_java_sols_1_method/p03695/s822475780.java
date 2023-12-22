import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            if(1 <= a[i] && a[i] <= 399){
                map.put("grey", 1);
            } else if(a[i] <= 799){
                map.put("brown", 1);
            } else if(a[i] <= 1199){
                map.put("green", 1);
            } else if(a[i] <= 1599){
                map.put("mizu", 1);
            } else if(a[i] <= 1999){
                map.put("blue", 1);
            } else if(a[i] <= 2399){
                map.put("yellow", 1);
            } else if(a[i] <= 2799){
                map.put("orange", 1);
            } else if(a[i] <= 3199){
                map.put("red", 1);
            } else {
                if(map.containsKey("all"))
                    map.put("all", map.get("all") + 1);
                else
                    map.put("all", 1);
            }
        }
        sc.close();

        int min = 0;
        int max = 0;
        if(map.size() == 1 && !(map.containsKey("all"))){
            min = 1;
            max = 1;
        } else if(map.size() == 1){
            min = 1;
            max = map.get("all");
        }else{
            for(String key: map.keySet()){
                if(key.equals("all")){
                    max += map.get(key);
                } else {
                    min += map.get(key);
                    max += map.get(key);
                }
            }
        }
        System.out.println(min + " " + max);
    }
}