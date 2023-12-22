import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> words = new ArrayList<>();
            words.add(br.readLine());
            words.add(br.readLine());
            words.add(br.readLine());

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < words.size(); i++) {
                result.append(words.get(i).substring(i, i + 1));
            }

            System.out.println(result);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}