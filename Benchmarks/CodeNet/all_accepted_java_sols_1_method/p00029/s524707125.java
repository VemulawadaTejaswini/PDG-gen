import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        int max_letters = 0;
        int max = 0;
        while(sc.hasNext()){
            String str = sc.next();
            if(map.containsKey(str)){
                int cnt = map.get(str);
                max = Math.max(max,cnt+1);
                map.remove(str);
                map.put(str,cnt+1);
            }
            else{
                map.put(str,1);
                max_letters = Math.max(max_letters,str.length());
            }
        }
        String a = "";
        String b = "";
        for(String key : map.keySet()){
            if(map.get(key) == max)
                a = key;
            if(key.length() == max_letters)
                b = key;
        }
        System.out.println(a + " " + b);
    }
}
