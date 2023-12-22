import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            String strArr[] = br.readLine().split(" ");
            Map<Long, Integer> map = new HashMap<Long, Integer>();
            for (int i = 0; i < n; i++) {
                long temp = Long.parseLong(strArr[i]);
                if (map.containsKey(temp)) {
                    int val = map.get(temp) + 1;
                    map.put(temp, val);
                } else {
                    map.put(temp, 1);
                }
            }
            int count = 0;
            for(Map.Entry<Long, Integer> e : map.entrySet()) {
                long key = e.getKey();
                int val = e.getValue();
                if (val > key) {
                    count += val - key;
                } else if (key > val) {
                    count += val;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
