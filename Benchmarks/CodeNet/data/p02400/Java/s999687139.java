
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        int r;
        double x,y;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String data = reader.readLine();
        System.out.println("1");
        r = Integer.parseInt(data);
        System.out.println(r);
        x = (double)r * (double)r * (double)3.14159265;
        y = (double)2 * (double)r * (double)3.14159265;
        
        builder
           .append(String.format("%.6f",(x)))
           .append(" ")
           .append(String.format("%.6f",(y)));
        System.out.println(builder);        
    }
}