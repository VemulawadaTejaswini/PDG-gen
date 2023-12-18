import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        List<Integer> inputs = new ArrayList<>();
        while ((line = br.readLine().trim()) != null && !line.isEmpty() && !"0 0".equals(line)) {
            output(line);
        }
    }

    public static void output(String inputs) {
        List<Integer> list = Arrays.stream(inputs.split(" ")).map(Integer::valueOf).collect(Collectors.toList());

        int people = list.get(0);
        int stone = list.get(1);

        int cnt = 0;
        int now = stone;
        Integer[] tmp  = new Integer[people];
        for(int i = 0; i < people; i++) {
            tmp[i] = 0;
        }

        while (true) {
            if(0 < now) {
                now--;
                tmp[cnt]++;
            }
            else if(0 == now && 0 < tmp[cnt]) {
                now+=tmp[cnt];
                tmp[cnt] = 0;
            }
            if(tmp[cnt] == stone) {
                System.out.println(cnt);
                break;
            }
            if(++cnt == people) cnt = 0;
        }
    }
}