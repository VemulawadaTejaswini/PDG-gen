import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        double r = Double.parseDouble(in.next());
        double pi = Math.PI;

        System.out.printf("%.5f %.5f", pi*r*r, 2*pi*r);
    }
}