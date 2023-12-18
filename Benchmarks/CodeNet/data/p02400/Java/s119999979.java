import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        double r = Double.valueOf(line[0]);

        double d,l;

        d = (double)r * (double)r * 3.141592653589;
        l = 2 * r * 3.141592653589;
        
        System.out.printf("%.5f %.5f", d, l);

    }

}