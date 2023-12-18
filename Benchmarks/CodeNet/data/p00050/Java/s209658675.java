import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        line = line.replaceAll("apple", "pea-ch");
        line = line.replaceAll("peach", "apple");
        line = line.replaceAll("pea-ch", "peach");

        System.out.println(line);
    }
}
