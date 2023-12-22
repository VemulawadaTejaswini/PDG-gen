import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {

        DecimalFormat df1 = new DecimalFormat("0.00000");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.valueOf(br.readLine());

        double pi = Math.PI;

        String S = df1.format((double)( r * r * pi));
        String L = df1.format((double)( 2 * r * pi));

        System.out.println(S + " " + L);
    }
}