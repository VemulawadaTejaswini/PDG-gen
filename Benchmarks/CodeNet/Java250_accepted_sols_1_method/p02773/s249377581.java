
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        int max = 1;
        for(int i = 0; i < n; ++i){
            String s = cin.next();
            if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                Integer ii = map.get(s);
                map.put(s,ii+1);
                max = Math.max(max,ii+1);
            }
        }

        List<String> ans = new ArrayList<>();
        for (String key: map.keySet()) {
            Integer v = map.get(key);
            if(v == max){
                ans.add(key);
            }
        }

        Collections.sort(ans);
        for (String item:ans){
            System.out.println(item);
        }



    }



}
