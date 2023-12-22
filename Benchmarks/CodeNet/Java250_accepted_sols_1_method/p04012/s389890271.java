
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        Map<String , Integer> m = new HashMap<String, Integer>();

        for (int i = 0 ; i < w.length() ; i++) {
            String s = w.substring(i, i + 1);
            if (m.containsKey(s)) {
                m.put(s, m.get(s) + 1);
            } else {
                m.put(s, 1);
            }
        }
        Iterator<Integer> i = m.values().iterator();
        while (i.hasNext()) {
            Integer a = i.next();
            if (a % 2 == 1) {
                System.out.println("No");
                return;
            }
        }


        System.out.println("Yes");
    }

}