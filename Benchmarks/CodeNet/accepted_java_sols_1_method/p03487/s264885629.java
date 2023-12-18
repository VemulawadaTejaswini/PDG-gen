import java.util.*;
import java.util.Map.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<String, Integer>();
        while (n-- > 0) {
            int num = sc.nextInt();
            String strNum = String.valueOf(num);
            if (!map.containsKey(strNum)) {
                map.put(strNum, 1);
            } else {
                int v = map.get(strNum);
                map.put(strNum, v + 1);
            }
        }
        
        int count = 0;
        for (Entry<String, Integer> entry : map.entrySet()) {
            int key = Integer.parseInt(entry.getKey());
            int val =  entry.getValue();
            
            if (val > key) {
                count += val - key;
            } else if (val < key) {
                count += val;
            }
        }
        
        System.out.println(count);
    }
}
