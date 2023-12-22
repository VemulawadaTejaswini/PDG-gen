import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String data[] = reader.readLine().split(" ");
        int a = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1]);
        int d;
        int r;
        String f;

        d = a / b;
        r = a % b;
        f = (String.format("%.5f", ((double) a / (double) b)));

        sb
                .append(d)
                .append(" ")
                .append(r)
                .append(" ")
                .append(f)
                .append("\n");
        System.out.println(sb);
    }
}