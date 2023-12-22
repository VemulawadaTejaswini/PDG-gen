import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (map.containsKey(s)) {
                int cnt = map.get(s);
                map.put(s, ++cnt);
                max = Math.max(max, cnt);
            } else {
                map.put(s, 1);
                max = Math.max(max, 1);
            }
        }
        
        final int MAX = max;
        new ArrayList<>(map.entrySet())
                .stream()
                .filter(e -> e.getValue() == MAX)
                .map(e -> e.getKey())
                .sorted()
                .forEach(k -> {
                    try {
                        bw.write(k + "\n");
                    } catch (IOException e) {}
                });
        
        bw.flush();
    }
}