
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            int i = 1;
            int num = Integer.parseInt(line);
            if (num == 0) {
                break;
            }
            System.out.println("Case "+ i++ +": "+ num);
        }
    }
}

