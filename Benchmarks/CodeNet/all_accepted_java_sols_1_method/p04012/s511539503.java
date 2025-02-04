import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] w = sc.next().toCharArray();
        Map<Character, Integer> alphabets = new HashMap<>();
        
        for (int i = 0; i < w.length; i++) {
            int current = 0;
            if (alphabets.containsKey(w[i])) {
                current = alphabets.get(w[i]);
            }
            alphabets.put(w[i], current + 1);
        }
        
        for (Character c : alphabets.keySet()) {
            if (alphabets.get(c) % 2 != 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
