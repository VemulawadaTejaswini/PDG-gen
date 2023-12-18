import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        int X = Integer.parseInt(line[1]);
        int D = 1;

        List<Integer> list = Arrays.stream(br.readLine().split(" "))
            .map(Integer::parseInt)
            .map(x -> Math.abs(x - X))
            .distinct()
            .sorted()
            .collect(Collectors.toList());
            
        int smallest = list.get(0);
        int listSize = list.size();

        PARENT:
        for (int i = smallest; i > 1; i--) {
            for (int j = 0; j < listSize; j++) {
                if (list.get(j) % i != 0) {
                    break;
                }
                if (j == listSize - 1) {
                    D = i;
                    break PARENT;
                }
            }
        }
        out.println(D);
        out.close();
    }
}