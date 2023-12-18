import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double S = r*r*Math.PI;
        double C = 2*r*Math.PI;
        System.out.println(String.format("%.8f", S) + " " + String.format("%.8f", C));
    }
}
