import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < 4; i++) {
            if(map.containsKey(s[i])) map.put(s[i], map.get(s[i]) + 1);
            else map.put(s[i], 1);
        }
        if(map.size() == 2) {
            Set<Character> set = map.keySet();
            boolean flag = true;
            for(char c : set) {
                if(map.get(c) != 2) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag? "Yes":"No");
        }else {
            System.out.println("No");
        }
    }
}