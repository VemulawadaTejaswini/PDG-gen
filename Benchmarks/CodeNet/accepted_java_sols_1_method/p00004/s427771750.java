import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            StringTokenizer st = new StringTokenizer(line);
            int a, b, c, d, e, f;
            double x, y;
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            f = Integer.parseInt(st.nextToken());
            x = (double) (c * e - b * f) / (a * e - b * d);
            y = (double) (c * d - a * f) / (b * d - a * e);
            if (x == -0)
                x = 0;
            if (y == -0)
                y = 0;
            sb.append(String.format("%4.3f %4.3f\n", x, y));
        }
        System.out.print(sb.toString());
    }
}