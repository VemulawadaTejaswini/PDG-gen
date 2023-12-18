import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        String x = a.readLine();
        int i = Integer.parseInt(x);
        int h, m, s;
        h = i / 3600;
        m = (i % 3600) / 60;
        s = ((i % 3600) % 60);
        System.out.println(h + ":" + m + ":" + s);
    }