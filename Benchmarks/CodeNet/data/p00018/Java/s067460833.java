import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            StringBuffer sb = new StringBuffer();
            Arrays.stream(line.split(" ")).map(Integer::parseInt).sorted(Comparator.reverseOrder()).forEach(v->{
               sb.append(v + " ");
            });
            System.out.println(sb.toString().trim());
        }
    }
}