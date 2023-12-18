import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        List<String> list = new ArrayList<>();
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            list.add(line);
        }
        list.stream().map(Integer::parseInt).sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
