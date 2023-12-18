import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = Arrays.stream(br.readLine().split(" "))
            .map(Integer::parseInt)
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
            
        int longest = 0;
        int others = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                longest = list.get(i);
            } else {
                others += list.get(i);
            }
        }
        out.println(longest >= others ? "No" : "Yes");
        out.close();
    }
}
