import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double r=Double.parseDouble(reader.readLine());
        Double s=r*r*Math.PI;
        Double c=r*2*Math.PI;
        System.out.println(s+" "+c);
    }
}