import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty() && !"0".equals(line)) {
            String oct = Integer.toOctalString(Integer.valueOf(line));
            oct = oct.replaceAll("7","9");
            oct = oct.replaceAll("6","8");
            oct = oct.replaceAll("5","7");
            oct = oct.replaceAll("4","5");
            System.out.println(oct);
        }
    }
}
