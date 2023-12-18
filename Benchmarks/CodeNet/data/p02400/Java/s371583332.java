import java.io.*;

class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.parseDouble(reader.readLine);
        
        double S = r * r * Math.PI;
        double R = 2 * r * Math.PI;
        
         System.out.printf("%.6f %.6f", S, R);
    }
}