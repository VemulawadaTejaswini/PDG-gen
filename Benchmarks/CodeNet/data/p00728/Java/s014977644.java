import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        Integer cnt = 0;
        List<Integer> inputs = new ArrayList<>();
        while ((line = br.readLine().trim()) != null && !line.isEmpty()) {
            if (cnt == 0) {
                if("0".equals(line)) System.exit(0);
                cnt = Integer.parseInt(line);
                continue;
            }
            inputs.add(Integer.parseInt(line));
            if (--cnt == 0) {
                output(inputs.stream().sorted().collect(Collectors.toList()));
                inputs.clear();
            }
        }
    }

    public static void output(List<Integer> inputs) {
        int sum = 0;
        for(int i : inputs.subList(1, inputs.size()-1)) {
            sum+=i;
        }
        System.out.println(sum/(inputs.size()-2));
    }
}