import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = in.readLine()) != null) {
            int i = Integer.parseInt(s);
            int ret = i + i * i + i * i * i;
            System.out.println(ret);
        }
    }
}
