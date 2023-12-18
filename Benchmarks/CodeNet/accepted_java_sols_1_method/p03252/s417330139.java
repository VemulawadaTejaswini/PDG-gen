import java.util.*;
import java.util.Map.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String strS = sc.next();
        String strT = sc.next();
        int n = strS.length();
        
        Map<String, Integer> s = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String str = String.valueOf(strS.charAt(i));
            if (s.containsKey(str)) {
                
                s.put(str, s.get(str) + 1);
            } else {
                s.put(str, 1);
            }
        }
        
        Map<String, Integer> t = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String str = String.valueOf(strT.charAt(i));
            if (t.containsKey(str)) {
                
                t.put(str, t.get(str) + 1);
            } else {
                t.put(str, 1);
            }
        }
        
        int index = 0;
        int[] aryS = new int[s.size()];
        for (Entry<String, Integer> entry : s.entrySet()) {
            aryS[index] = entry.getValue();
            index++;
        }
        
        index = 0;
        int[] aryT = new int[t.size()];
        for (Entry<String, Integer> entry : t.entrySet()) {
            aryT[index] = entry.getValue();
            index++;
        }
        
        boolean clear = true;
        if (aryS.length != aryT.length) {
            clear = false;
        } else {
            Arrays.sort(aryS);
            Arrays.sort(aryT);
        
            for (int i = 0; i < aryS.length; i++) {
                if (aryS[i] != aryT[i]) {
                    clear = false;
                    break;
                } 
            }
        }

        
        if (clear) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
