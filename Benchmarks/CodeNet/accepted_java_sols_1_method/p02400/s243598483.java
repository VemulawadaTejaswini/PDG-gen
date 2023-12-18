import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double inputRadius = sc.nextDouble();
        System.out.print(String.format("%f", Math.pow(inputRadius, 2) * Math.PI));       //円の面積
        System.out.println(" " + String.format("%f\n", inputRadius * 2 * Math.PI));        //円周の長さ
    }
}

