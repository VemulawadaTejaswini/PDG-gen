import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static Map<String, String> mapping = new HashMap<>();
    public static List<String> inputs = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        Integer cnt = 0;
        boolean bit2 = false;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int len = line.split(" ").length;
            if(len == 1) {
                if(bit2) {
                    cnt = Integer.parseInt(line.trim());
                    bit2 = false;
                    continue;
                }
                if(cnt==0){
                    output();
                    continue;
                }
                inputs.add(line.trim());
                cnt--;
                if(cnt <=0 && "0".equals(line)) break;
            }
            if(len == 2) {
                List<String> tmp = Arrays.stream(line.split(" ")).collect(Collectors.toList());
                mapping.put(tmp.get(0).trim(), tmp.get(1).trim());
                bit2 = true;
            }
        }
    }

    public static void output() {
        inputs.forEach(s->System.out.print(mapping.get(s) != null ? mapping.get(s) : s));
        mapping.clear();
        inputs.clear();
        System.out.println();
    }
}