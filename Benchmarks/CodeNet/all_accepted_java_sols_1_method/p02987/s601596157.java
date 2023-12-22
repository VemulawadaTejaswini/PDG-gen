import java.util.Scanner;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String h = scan.next();
    String[] ha = h.split("");
                
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put(ha[0], 1);
    int sum = 0;

    for(int i = 1; i < 4; i++){
      if(map.containsKey(ha[i])){
        map.put(ha[i], map.get(ha[i]) + 1);
      }else{
        map.put(ha[i], 1);
      }

      
    }

for(String key : map.keySet()){
 if(map.get(key) != 2){
    System.out.println("No");
   return;
 }
}

    System.out.println("Yes");
        }
}