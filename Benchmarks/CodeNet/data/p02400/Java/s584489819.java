import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in), 1);
        String s = br.readLine();

        int r = Integer.parseInt(s);
        String area = String.format("%.6f", (double)r*(double)r*Math.PI);
        String circum = String.format("%.6f", (double)r*2*Math.PI);
        System.out.println(area + " " + circum);
    }
}