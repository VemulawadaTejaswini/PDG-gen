import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 1;
        int min = 2000000000;
        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            List<Integer> list = Arrays.stream(line.split(" ")).map(Integer::parseInt).sorted().collect(Collectors.toList());
            // a < b
            int a = list.get(0);
            int b = list.get(1);
            for(int i = a; 1 <= i; i--) {
                if(a % i == 0 && b % i ==0) {
                    max = i;
                    break;
                }
            }
            for(int i = b; i <= 2000000000; i = i + max) {
                if(i % a== 0 && i % b ==0) {
                    min = i;
                    break;
                }
            }
            System.out.println(max + " " + min);
        }
    }
}
