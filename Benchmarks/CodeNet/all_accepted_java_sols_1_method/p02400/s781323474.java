import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.######");
        Double r = Double.parseDouble(br.readLine());
        double area = (Math.PI * r) * r;
        double circumference = 2 * Math.PI * r;
        bw.append(df.format(area) + " " + df.format(circumference) + "\n");
        bw.flush();
    }
}
