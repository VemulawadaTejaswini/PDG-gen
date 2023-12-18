import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.math.BigDecimal;

public class Main {
    public static Scanner sc;
    public static TreeMap<String, BigDecimal> map;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        
        BigDecimal bd = new BigDecimal(1000000);
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            
            map = new TreeMap<String, BigDecimal>();
            
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                BigDecimal cost = new BigDecimal(sc.nextLong() * sc.nextLong());
                
                if (map.containsKey(s)) {
                    cost = cost.add(map.get(s));
                    map.put(s, cost);
                } else {
                    map.put(s, cost);
                }
            }
            
            boolean isShow = false;
            
            for (String s: map.keySet()) {
                if (map.get(s).compareTo(bd) >= 0) {
                    System.out.println(s);
                    isShow = true;
                } 
            }
            
            if (!isShow) {
                System.out.println("NA");
            }
        }
    }
}