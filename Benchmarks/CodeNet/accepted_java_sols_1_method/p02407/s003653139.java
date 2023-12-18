import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            br.lines().forEach(s -> {
                List<String> list = Arrays.asList(s.split(" "));

                Collections.reverse(list);

                String answer = String.join(" ", list);

                System.out.println(answer);
            });
        }
    }
}