import java.util.*;
import java.text.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        double r = scn.nextDouble();
        DecimalFormat df = new DecimalFormat("#.#####");
        System.out.println(
          df.format(Math.PI * Math.pow(r, 2)) + " " +
          df.format(Math.PI * r * 2)
        );
    }
}