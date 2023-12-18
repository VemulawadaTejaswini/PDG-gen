import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            final int n = Integer.parseInt(br.readLine());
            if (n == 0) { break; }
            
            Map<String, Long> data = new LinkedHashMap<>();
            for (int i=1; i <= n; i++) {
                String[] st = br.readLine().split(" ");
                String e = st[0];
                Long p = Long.parseLong(st[1]);
                Long q = Long.parseLong(st[2]);
                data.merge(e, p * q, Long::sum);
            }
            
            long count = data.entrySet().stream()
                .filter(e -> e.getValue() >= 1_000_000L)
                .peek(e -> System.out.println(e.getKey()))
                .count();
            if (count == 0L) { System.out.println("NA"); }
        }
    }
}