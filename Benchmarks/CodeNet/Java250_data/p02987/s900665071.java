import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            if(!map.containsKey(s[i])) {
                map.put(s[i], 1);
            }
            else {
                map.put(s[i], map.get(s[i]) + 1);
            }
        }
        if(map.size() == 2 && map.get(s[0]) == 2) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}