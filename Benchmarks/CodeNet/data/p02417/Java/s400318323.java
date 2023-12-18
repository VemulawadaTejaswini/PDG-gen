import java.util.*;
 
public class Main {
     
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
     
    private void solv() {
        Scanner input = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, 0);
        }
        while (input.hasNext()) {
            char[] cs = input.nextLine().toCharArray();
            for (int i = 0; i < cs.length; i++) {
                if ('A' <= cs[i] && cs[i] <= 'Z') cs[i] -= 'A' - 'a';
                if ('a' <= cs[i] && cs[i] <= 'z') map.put(cs[i], map.get(cs[i]) + 1);
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(String.format("%c : %d", c, map.get(c)));
        }
    }
}