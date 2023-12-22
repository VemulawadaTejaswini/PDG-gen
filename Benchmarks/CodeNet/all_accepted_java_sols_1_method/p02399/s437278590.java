import java.util.*;
import java.text.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int a = scn.nextInt(), b = scn.nextInt();
        DecimalFormat df = new DecimalFormat("#.#####");
        System.out.println(a / b + " " + a % b + " " + df.format((double)a / b));
    }
}