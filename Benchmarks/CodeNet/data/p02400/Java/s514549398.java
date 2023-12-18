import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader std = new BufferedReader(new InputStreamReader(System.in));
        
        double r = Double.parseDouble(std.readLine());
        
        double b = Math.PI * r * r;
        double c = 2 * Math.PI * r;
        
        System.out.printf("%.5f %.5f\n", b,c);
        
    }
}