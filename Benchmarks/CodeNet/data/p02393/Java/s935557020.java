import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
 
public class Main {
    private static Scanner scan;
 
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.println(sort(scan.nextInt(),scan.nextInt(),scan.nextInt()));
    }
 
    /**
     * ソートして返します。
     */
    private static String sort(int a, int b, int c) {
        String value = "";
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        map.put(a, a);
        map.put(b, b);
        map.put(c, c);
        for(Integer hoge : map.values()) {
            value += hoge + "";
        }
        return value;
    }
}