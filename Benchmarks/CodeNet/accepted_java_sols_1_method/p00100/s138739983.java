import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            final int n = Integer.parseInt(br.readLine());
            if (n == 0) { break; }
            
            Map<String, Long> data = new HashMap<>();
            List<String> out = new ArrayList<>();
            for (int i=1; i <= n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String e = st.nextToken();
                Long p = Long.parseLong(st.nextToken());
                Long q = Long.parseLong(st.nextToken());
                Long total = data.getOrDefault(e, 0L) + p * q;
                data.put(e, total);
                if (total >= 1_000_000L) {
                    if (out.contains(e) == false) {
                        System.out.println(e);
                        out.add(e);
                    }
                }
            }
            if (out.isEmpty()) {
                System.out.println("NA");
            }
        }
    }
}