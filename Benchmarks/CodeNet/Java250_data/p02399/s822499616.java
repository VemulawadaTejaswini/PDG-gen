import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in), 1);
        String is = br.readLine();
        String[] sp = is.split(" ");

        int a = Integer.parseInt(sp[0]);
        int b = Integer.parseInt(sp[1]);
        int d =a/b;
        int r = a%b;
        double f = (double)a/(double)b;
        String fs = String.format("%.8f", f);

        System.out.println(d + " " + r + " "+ fs);
    }
}