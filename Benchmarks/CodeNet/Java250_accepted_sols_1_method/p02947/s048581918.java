import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
 
        long cnt = 0;
        for (int i = 0; i < n; i++) {
            char[] c = s[i].toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                int cmb = map.get(str);
                cnt += cmb;
                map.put(str, cmb + 1);
            }
        }
        System.out.println(cnt);
    }
 
}