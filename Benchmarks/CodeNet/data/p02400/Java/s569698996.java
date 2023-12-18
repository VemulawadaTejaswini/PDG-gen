import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        double r = scn.nextDouble();
        System.out.println(
          Math.PI * Math.pow(r, 2) + " " + Math.PI * r * 2
        );
    }
}