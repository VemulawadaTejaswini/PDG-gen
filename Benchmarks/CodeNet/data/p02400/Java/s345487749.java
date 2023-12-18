import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        double area, circumference, r;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder createString = new StringBuilder();
        String line = br.readLine();
        String[] numbers = line.split(" ");
        
        r = Integer.parseInt(numbers[0]);
        
        area = Math.PI * (r * r);
        circumference = 2 * (Math.PI * r);
        
        System.out.printf("%6f %6f", area, circumference);
    }
}