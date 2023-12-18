import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    private enum right {
        y,
        u,
        i,
        o,
        p,
        h,
        j,
        k,
        l,
        n,
        m,
        ;
   }

    static String current = "";
    static int cnt = 0;
    static List<String> hands = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine().trim()) != null && !"#".equals(line)) {
            output(line);
        }
    }

    public static void output(String line) {
        IntStream.range(0, line.length()).mapToObj(i->line.substring(i,i+1)).forEach(key -> {
            if(Arrays.stream(right.values()).map(e->e.name()).anyMatch(e->key.equals(e))) {
                hands.add("r");
            } else {
                hands.add("l");
            };
        });
        IntStream.range(0, hands.size()).mapToObj(i->hands.get(i)).forEach(hand -> {
            if(!current.isEmpty() && !current.equals(hand)) {
                cnt++;
            }
            current = hand;
        });
        System.out.println(cnt);
        hands.clear();
        current = "";
        cnt = 0;
    }
}
