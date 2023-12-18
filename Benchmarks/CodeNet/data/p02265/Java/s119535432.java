import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final List<String> numbers = new ArrayList<String>(1000000);

        final int n = Integer.parseInt(reader.readLine());

        String line;
        for (int i = 0; i < n; ++i) {
            line = reader.readLine();
            if ('i' == line.charAt(0)) {
                numbers.add(line.substring(7));
            }else if ('F' == line.charAt(6)) {
                numbers.remove(0);
            } else if ('L' == line.charAt(6)) {
                numbers.remove(numbers.size() - 1);
            } else {
                numbers.remove(line.substring(7));
            }
        }

        for (String str : numbers) {
            System.out.println(str);
        }

        final StringBuilder answer = new StringBuilder();
        final int listSize = numbers.size() - 1;
        for (int i = 0; i < listSize; ++i) {
            answer.append(numbers.remove(numbers.size()-1)).append(" ");
        }
        answer.append(numbers.remove(0));

        System.out.print(answer.toString());
    }
}