import java.util.*;
import java.math.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static double x,h;
    static double S;
    public static void main(String[] args) {
        while(read()){
            slove();
        }
    }
    static boolean read(){
        if(!sc.hasNextInt())return false;
        x = h = 0;
        x = sc.nextDouble();
        h = sc.nextDouble();
        S = 0;


        if(x == 0 && h == 0){
            return false;
        }

        return true;
    }
    static void slove(){
        double square = x*x;
        double height_tri = Math.sqrt(x*x/4 + h*h);
        double Sum_tri = x*height_tri*2;
        S = Sum_tri + square;
        System.out.printf("%.6f\n", S);
    }
}