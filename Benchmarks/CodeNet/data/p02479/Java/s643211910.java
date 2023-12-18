import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        double r = Double.parseDouble(line);
        double area =2*Math.PI*r;
        double circumference =Math.PI*r*r;
        System.out.printf("%.5f %.5f", area, circumference);
    }
}