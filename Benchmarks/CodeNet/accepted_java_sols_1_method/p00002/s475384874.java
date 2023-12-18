import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while( (line = br.readLine()) != null) {
            String[] line2 = line.split(" ");
            Integer i = new Integer(Integer.parseInt(line2[0]) + Integer.parseInt(line2[1]));
            System.out.println(i.toString().length());
        }
    }
}