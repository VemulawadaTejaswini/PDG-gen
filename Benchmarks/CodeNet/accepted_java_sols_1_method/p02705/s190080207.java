import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        var rd = new BufferedReader(new InputStreamReader(System.in));
        var r = Integer.parseInt(rd.readLine());
        System.out.println(2 * Math.PI * r);
    }
}
