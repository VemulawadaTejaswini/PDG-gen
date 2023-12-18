import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double r=Double.parseDouble(reader.readLine());
        Double area=r*r*Math.PI;
        Double circumference=r*2*Math.PI;
        System.out.println(String.format("%.6f %.6f", area, circumference));
    }
}