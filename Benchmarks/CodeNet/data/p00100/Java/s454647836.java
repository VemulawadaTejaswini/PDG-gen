import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            final int n = Integer.parseInt(br.readLine());
            if (n == 0) { break; }
             
            Map<String, Long> data = new HashMap<>(n);
            List<String> out = new ArrayList<>();
            for (int i=1; i <= n; i++) {
                String[] st = br.readLine().split(" ");
                String e = st[0];
                long p = Long.parseLong(st[1]);
                long q = Long.parseLong(st[2]);
                long total = data.getOrDefault(e, 0L) + p * q;
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