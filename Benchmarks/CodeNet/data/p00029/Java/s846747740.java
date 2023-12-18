import java.util.*;

public class Main{
   Scanner in = new Scanner(System.in);

   void solve(){
        HashMap<String, Integer> map = new HashMap<>();
        String min = "";
        String[] line = in.nextLine().split(" ");

        for(String s : line){
            if(map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            }else{
                map.put(s, 1);
            }
            if(min.length() < s.length()){
                min = s;
            }
        }
        String maxStr = "";
        int maxVal = 0;
        for(String s: map.keySet()){
            if(maxVal < map.get(s)){
                maxVal = map.get(s);
                maxStr = s;
            }
        }
        System.out.println(maxStr + " " + min);
        
   }

   public static void main(String[] args){
       new Main().solve();    
   }
}