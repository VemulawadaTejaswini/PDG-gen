import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.next()); 
        List<String> targets = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            targets.add(scan.next());
        }
        scan.close();

        Map<String, Long> tmp = new HashMap<String, Long>();
        for (String target : targets) {
            char[] c = target.toCharArray();
            Arrays.sort(c);
            String sortTarget = new String(c);
            if (tmp.containsKey(sortTarget)) {
                tmp.put(sortTarget, tmp.get(sortTarget) + 1);
            } else {
                tmp.put(sortTarget, 0L);
            }
        }
        
        long result = 0;
        for (Long l : tmp.values()) {
            for (long t = 1; t < l + 1; t++) {
                result += t;
            }
        }

        System.out.println(result);
    }
}