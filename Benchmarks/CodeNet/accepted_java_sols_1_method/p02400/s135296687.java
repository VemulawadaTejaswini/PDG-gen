import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.print(String.format("%.6f", a*a*Math.PI)+" "+String.format("%.6f", 2*a*Math.PI));
        System.out.println();
    }
}
