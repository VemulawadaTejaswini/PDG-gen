import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();           
            double r = Double.parseDouble(line);
            double area = r*r*Math.PI;
            double circumference = 2*r*Math.PI; 
            System.out.printf("%f %f\n",area,circumference);

    }
}
