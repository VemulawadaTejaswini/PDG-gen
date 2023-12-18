import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       while (in.hasNextInt()) {
           double  a = in.nextInt();
           double  b = in.nextInt();
           double  c = in.nextInt();
           double  d = in.nextInt();
           double  e = in.nextInt();
           double  f = in.nextInt();

           double y = (d*c-a*f) / (b*d-a*e);
           double x = 0;
           if(a != 0) x = (c-b*y) / a;
           else x = (f-e*y) / d;
           if (x == -0.000) x += 0;
           if (y == -0.000) y += 0;
           System.out.printf("%.3f %.3f\n", x, y);
       }
    }
}