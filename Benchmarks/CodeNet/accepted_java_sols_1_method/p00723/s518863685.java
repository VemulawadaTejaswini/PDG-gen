import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        
        while (TC-- > 0) {
            String str = sc.next();
            int L = str.length();
            
            HashSet<String> set = new HashSet<String>();
            set.add(str);
            
            for (int i = 1; i < L; i++) {
                StringBuilder str1 = new StringBuilder(str.substring(0, i));
                StringBuilder str2 = new StringBuilder(str.substring(i));
                // System.out.println(str1.toString() + " " + str2.toString());
                
                String s1 = str1.toString();
                String s2 = str2.toString();
                String r1 = str1.reverse().toString();
                String r2 = str2.reverse().toString();
                
                set.add(s1 + r2);
                set.add(r1 + s2);
                set.add(r1 + r2);
                
                set.add(s2 + s1);
                set.add(s2 + r1);
                set.add(r2 + s1);
                set.add(r2 + r1);
            }
            
            System.out.println(set.size());
        }
    }
}


