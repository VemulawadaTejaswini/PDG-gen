
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    long n;
    String as;
    BufferedReader br;

    public static void main(String[] args) {
        Main m = new Main();
        boolean f = m.read();
        while (f) {
            m.solve();
            f = m.read();
        }
    }

    private boolean read() {
        try  {
            if (br == null)
                    br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            n = Long.parseLong(line);
            if (n == 0)
                return false;
            as = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    private void solve() {
        HashMap<Character, Long> map = new HashMap<>();
        for (int i = 0; i < as.length(); i++) {
            char s = as.charAt(i);
            if (s == ' ')
                continue;
            if (!map.containsKey(s)) {
                map.put(s, 1L);
            }
            else {
                map.put(s, map.get(s)+1L);
            }
        }
        Iterator itr = map.keySet().iterator();
        long ans = Long.MIN_VALUE;
        long tmp;
        char key='a', tmpKey;
        while (itr.hasNext()) {
            tmpKey = (Character) itr.next();
            tmp = map.get(tmpKey);
            if (ans < tmp) {
                key = tmpKey;
                ans = tmp;
            }
        }
        if (ans > n / 2)
            System.out.println(key);
        else
            System.out.println("NO COLOR");
    }
}