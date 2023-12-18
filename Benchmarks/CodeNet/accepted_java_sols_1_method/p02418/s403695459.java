import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String p = br.readLine();

        String ss = s + s;

        if (ss.contains(p)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}