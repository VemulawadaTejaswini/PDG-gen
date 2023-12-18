import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            double area = x * x * Math.PI;
            double circle = 2 * x * Math.PI;
            System.out.printf("%.6f %.6f", area, circle);
    }
}
