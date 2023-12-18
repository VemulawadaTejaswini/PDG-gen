import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.nextLine());
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String str = scan.nextLine();
            if(map.containsKey(str)) map.put(str, map.get(str)+1);
            else map.put(str, 1);
        }
        int m = Integer.parseInt(scan.nextLine());
        for(int i=0; i<m; i++){
            String str = scan.nextLine();
            if(map.containsKey(str)) map.put(str, map.get(str)-1);
        }

        int max = 0;
        for(String key : map.keySet()){
            if(max < map.get(key)) max = map.get(key);
        }
        
        System.out.println(max);

        scan.close();
    
    }

}