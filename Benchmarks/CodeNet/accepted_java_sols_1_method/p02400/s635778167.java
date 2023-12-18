import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        double r = sc.nextDouble();
        double PI = 3.141592653589793238;
        
        System.out.printf("%.6f %.6f\n", (r*r*PI), (2*PI*r));
    }
}