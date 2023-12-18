
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        int a,b;
        int d,r;
        String f;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String data = reader.readLine();
        String[] number = data.split(" ");
        a = Integer.parseInt(number[0]);
        b = Integer.parseInt(number[1]);
        d = a / b;
        r = a % b;
        f = (String.format("%.5f",((double)a /(double)b)));
        
        builder
           .append(d)
           .append(" ")
           .append(r)
           .append(" ")
           .append(f)
           .append("\n");
        System.out.print(builder);
        }        
}