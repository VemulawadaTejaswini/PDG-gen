import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();

        String s = sc.next();

        for (char c = 'a'; c <= 'z'; c++) {
            mp.put(c, 0);
        }

        for (int i = 0; i < s.length(); i++) {
            if (mp.get(s.charAt(i)) != null) {
                int tmp = mp.get(s.charAt(i));
                mp.replace(s.charAt(i), tmp, tmp + 1);
            }
        }

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c + " : " + mp.get(c));
        }

        sc.close();
    }
}
