import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();        
        System.out.printf("%.7f %.7f", a * a * Math.PI, a * 2 * Math.PI);
    }         
}