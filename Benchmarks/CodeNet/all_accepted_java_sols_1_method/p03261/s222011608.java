import java.net.SecureCacheResponse;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] list = new String[n];
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String tmpStr = sc.next();
            list[i] = tmpStr;

            if (map.containsKey(tmpStr)) {
                map.put(tmpStr, map.get(tmpStr)+1);
            } else {
                map.put(tmpStr, 1);
            }
        }

        boolean ans = true;
        for (int i = 1; i < n; i++) {
            String pre = list[i-1];
            String cur = list[i];

            if (pre.charAt(pre.length()-1) == cur.charAt(0) && map.get(cur) == 1) {
                continue;
            } else {
                ans = false;
                break;
            }
        }

        System.out.println(ans ? "Yes" : "No");
    }
}
