import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);

        int d, r;
        double f;

        d = (int) ((int) a / b);
        r = (int) (a % b);
        f = (double) a / (double) b;

        System.out.printf("%d %d %.5f", d, r, f);

    }

}