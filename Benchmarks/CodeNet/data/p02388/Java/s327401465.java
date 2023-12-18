import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String line = r.readLine();
        while (line != null) {
            handleLine(line);
            line = r.readLine();
        }
    }
    
    public static void handleLine(String line) {
        int value = Integer.parseInt(line);
        System.out.println("" + (value * value * value));
    }
}