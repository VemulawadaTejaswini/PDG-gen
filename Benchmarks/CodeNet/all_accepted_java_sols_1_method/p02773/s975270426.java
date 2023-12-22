import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        Map<String,Integer> map = new TreeMap<>();
        int max = 0;
        for(int i = 0; i<n;i++){
            String s = sc.next();
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            } else {
                map.put(s,1);
            }
            max = Math.max(max,map.get(s));
        }
        for(String key : map.keySet()){
            if(map.get(key)==max){
                System.out.println(key);
            }
        }
    }
}