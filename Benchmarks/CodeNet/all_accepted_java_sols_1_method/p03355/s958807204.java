import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        int k = sc.nextInt() - 1;
        
        int n = c.length;
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j < Math.min(n, 5); j++) {
                if (i+j >= n) break;
                s += c[i+j];
                // System.out.println(s);
                set.add(s);
            }
        }
        List<String> list = new ArrayList<String>();
        for (String se : set) {
            list.add(se);
            // System.out.println(se);
        }
        list.sort(Comparator.naturalOrder());
        
        System.out.println(list.get(k));
    }
}