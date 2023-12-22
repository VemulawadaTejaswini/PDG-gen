import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "No";
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
        if(map.size() == 2 && map.containsValue(2)) ans = "Yes";
        System.out.println(ans);
    }
}
