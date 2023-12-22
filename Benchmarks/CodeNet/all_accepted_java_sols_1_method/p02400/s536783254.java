import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(String.format("%.7f", r * r * Math.PI) + " " + String.format("%.7f", 2 * r * Math.PI));

    }
  
}
