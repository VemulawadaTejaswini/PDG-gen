import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        System.out.printf("%.5f %.5f\n", r*r*Math.PI, 2*r*Math.PI);
    }
}