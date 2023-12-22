import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < w.length(); i++) {
            String c = String.valueOf(w.charAt(i));
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        
        if (set.size() == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}