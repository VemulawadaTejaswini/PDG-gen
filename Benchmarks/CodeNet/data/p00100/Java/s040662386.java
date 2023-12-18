import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        for(int n; (n = scn.nextInt()) > 0; printMap(createMap(n)));
    }
    
    private static Map<Integer, Long> createMap(int n) {
        Map<Integer, Long> mil = new LinkedHashMap<>();
        for(int i = 0; i < n; i++) {
            int id = scn.nextInt();
            long sale = scn.nextLong() * scn.nextLong();
            if(mil.containsKey(id)) {
                mil.put(id, mil.get(id) + sale);
            } else {
                mil.put(id, sale);
            }
        }
        return mil;
    }
    
    private static void printMap(Map<Integer, Long> mil) {
        boolean flg = true;
        for(Integer elm : mil.keySet()) {
            if(mil.get(elm) > 999999) {
                System.out.println(elm);
                flg = false;
            }
        }
        if(flg) {
            System.out.println("NA");
        }
    }
}