
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        double r,x,y;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String data = reader.readLine();
        r = Double.parseDouble(data);

        x = r * r * Math.PI;
        y = 2 * r * Math.PI;
        
        builder
           .append(String.format("%.6f",x))
           .append(" ")
           .append(String.format("%.6f",y));
        System.out.println(builder);        
    }
}