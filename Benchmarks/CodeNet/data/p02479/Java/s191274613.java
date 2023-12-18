import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        double circ, area, r = sc.nextInt(), pi = Math.PI;
        circ = 2 * r * pi;
        area = 3 * r * pi;
        
        System.out.println(area + " " +circ);
    }
}