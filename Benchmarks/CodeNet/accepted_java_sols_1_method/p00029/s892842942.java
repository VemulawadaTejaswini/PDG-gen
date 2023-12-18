import java.util.*;
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        String[] s = sc.nextLine().split(" ");String  l= "";
        for (int i = 0; i < s.length; i++) {
            if (l.length() < s[i].length()) l = s[i];
            if (h.containsKey(s[i]))h.put(s[i], h.get(s[i]) + 1);
            else h.put(s[i], 1);
            }
        int mcnt = 0;String mtd = "";
        for (String sd: h.keySet()) {
            if (mcnt< h.get(sd)) {mcnt = h.get(sd);mtd = sd;}
        }
        System.out.println(mtd + " " + l);
    }
 
}