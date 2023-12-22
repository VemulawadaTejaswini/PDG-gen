import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int f = s.indexOf("A");
        int e = s.lastIndexOf("Z");
        System.out.println(e - f + 1);
    }
}

