import java.util.Scanner;
import java.math.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        String S = String.format("%.6f", r * r * Math.PI);
        String L = String.format("%.6f", 2 * r * Math.PI);
        System.out.println(S + " " + L);
    }
}
