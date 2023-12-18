
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        float a = Float.parseFloat(line[0]);
        float b = Float.parseFloat(line[1]);

        
        int d,r;
        float f;
        
        d = (int) ((int)a / b);
        r = (int) (a % b);
        f = a / b;
        
        System.out.printf("%d %d %f", d,r,f);
    }

}