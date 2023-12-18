import java.util.*;
import java.text.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String s = sc.next();
        Map<String, String> map = new HashMap<>();
        map.put("A", "X");
        map.put("B", "Y");
        map.put("C", "Z");
        map.put("D", "A");
        map.put("E", "B");
        map.put("F", "C");
        map.put("G", "D");
        map.put("H", "E");
        map.put("I", "F");
        map.put("J", "G");
        map.put("K", "H");
        map.put("L", "I");
        map.put("M", "J");
        map.put("N", "K");
        map.put("O", "L");
        map.put("P", "M");
        map.put("Q", "N");
        map.put("R", "O");
        map.put("S", "P");
        map.put("T", "Q");
        map.put("U", "R");
        map.put("V", "S");
        map.put("W", "T");
        map.put("X", "U");
        map.put("Y", "V");
        map.put("Z", "W");
        
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String c = s.substring(i, i+1);
            res += map.get(c);
        }
        
        System.out.println(res);
    }
}