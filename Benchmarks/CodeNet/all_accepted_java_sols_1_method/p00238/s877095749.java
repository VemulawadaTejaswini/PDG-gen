import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while (!(line = br.readLine().trim()).equals("0") && !line.isEmpty()) {
 
            int goal = Integer.parseInt(line);
            int times = Integer.parseInt(br.readLine().trim());
            int sum = 0;
            for (int i = 0; i < times; i++) {
                line = br.readLine().trim();
                int s = Integer.parseInt(line.substring(0, line.indexOf(' ')));
                int f = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
                sum += f - s;
            }
            System.out.println(sum >= goal ? "OK" : goal - sum);
        }
    }
}

