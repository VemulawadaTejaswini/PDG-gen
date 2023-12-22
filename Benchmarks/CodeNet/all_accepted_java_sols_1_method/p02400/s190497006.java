import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            
            String line;
            
            while((line = stdReader.readLine()) != null) {
                double r = Double.parseDouble(line);
                double area   = r * r * Math.PI;
                double length = 2 * r * Math.PI;
                
                String circleArea   = String.format("%.6f", area);
                String circleLength = String.format("%.6f", length);
                
                System.out.println(circleArea + " " + circleLength);
            }
            stdReader.close();
        } catch(Exception e) {
            e.getStackTrace();
            System.exit(-1);
        }
    }
}