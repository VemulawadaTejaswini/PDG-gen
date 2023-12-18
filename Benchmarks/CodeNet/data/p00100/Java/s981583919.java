import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            final int times = Integer.parseInt(br.readLine());
            if (times == 0) { break; }
            
            Map<String, Long> data = new LinkedHashMap<>();
            Map<String, Long> out = new HashMap<>();
            for (int i=1; i <= times; i++) {
                String[] e = br.readLine().split(" ");
                Long total = data.merge(e[0], Long.parseLong(e[1]) * Long.parseLong(e[2]), Long::sum);
                if (total >= 1_000_000L) {
                    if (out.putIfAbsent(e[0], total) == null) {
                        System.out.println(e[0]);
                    }
                }
            }
            if (out.size() == 0) {
                System.out.println("NA");
            }
        }
    }
}