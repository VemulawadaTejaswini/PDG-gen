import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while( (line = br.readLine()) != null ) {
            String[] tokens = line.split(" ");
            Integer result = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]);
            System.out.println(result.toString().length());
        }
    }
}

