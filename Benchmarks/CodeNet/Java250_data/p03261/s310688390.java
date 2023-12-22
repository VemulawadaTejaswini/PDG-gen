
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String pre = sc.next();
        HashMap<String, Integer> map = new HashMap<>();
        map.put(pre, 1);
        boolean ok = true;
        for (int i = 1; i < n; i++) {
            String tk = sc.next();
            if (pre.charAt(pre.length() - 1) != tk.charAt(0))
                ok = false;
            if (map.containsKey(tk))
                ok = false;
            map.put(tk, 1);
            pre = tk;
        }

        System.out.println(ok ? "Yes" : "No");

    }

}
