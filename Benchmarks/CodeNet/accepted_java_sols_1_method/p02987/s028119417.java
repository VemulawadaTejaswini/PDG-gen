import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> cmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (cmap.containsKey(c)) {
                cmap.replace(c, cmap.get(c) + 1);
            } else {
                cmap.put(c, 1);
            }
        }
        String answer = "Yes";
        for (Character c : cmap.keySet()) {
            if (cmap.get(c) != 2) {
                answer = "No";
                break;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}