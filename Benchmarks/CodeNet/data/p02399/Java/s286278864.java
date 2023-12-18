import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class Main{


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.########");
        int a, b, d, r;
        double f;
        String[] st = br.readLine().split(" ");
        a = Integer.parseInt(st[0]);
        b = Integer.parseInt(st[1]);
        d = a / b;
        r = (a - ((a / b) * b));
        f = (double) a / b;
        bw.append(d + " " + r + " " + df.format(f) + "\n");
        bw.flush();
    }
}
