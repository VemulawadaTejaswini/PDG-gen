import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        double r = Double.parseDouble(line);
        System.out.printf("%f %f\n", r * r * Math.PI, r * 2 * Math.PI);
    }
}