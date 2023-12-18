import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        double x1 = in.nextDouble(), y1 = in.nextDouble(), x2 = in.nextDouble(), y2 = in.nextDouble();

        System.out.printf("%f\n",Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
}
