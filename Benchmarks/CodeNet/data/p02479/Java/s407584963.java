import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        double circ, area;
        int r = sc.nextInt(), pi = Math.PI;
        circ = 2 * r * pi;
        area = r * r * pi;
        
        System.out.printf("%.6f %.6f\n",area, circ);
    }
}