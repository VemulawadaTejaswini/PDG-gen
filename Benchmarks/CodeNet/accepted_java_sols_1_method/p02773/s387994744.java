import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        Map<String,Integer> map = new TreeMap<>();
        
        for(int i = 0;i < n;i++){
            String str = sc.next();
            if(map.containsKey(str)){
                int tmp = map.get(str)+1;
                map.put(str,tmp);
                max = Math.max(max,tmp);
            }else{
                map.put(str,1);
                max = Math.max(max,1);
            }
        }
        
        for(String key:map.keySet()){
            if(max == map.get(key)){
                System.out.println(key);
            }
        }

    }
}
