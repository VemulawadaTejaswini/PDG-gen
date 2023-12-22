import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            final int times = Integer.parseInt(br.readLine());
            if (times == 0) { break; }
            
            Map<String, Long> data = new LinkedHashMap<>();
            for (int i=1; i <= times; i++) {
                String[] e = br.readLine().split(" ");
                data.merge(e[0], Long.parseLong(e[1]) * Long.parseLong(e[2]), Long::sum);
            }
            
            int count = 0;
            for(Map.Entry<String, Long> e : data.entrySet()){
                if(e.getValue() >= 1_000_000){
                    System.out.println(e.getKey());
                    count++;
                }
            }
            if (count == 0) { System.out.println("NA"); }
        }
    }
}