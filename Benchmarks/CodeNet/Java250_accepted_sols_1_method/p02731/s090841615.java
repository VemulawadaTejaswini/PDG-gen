import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double L = sc.nextInt();
        
        //max a*b*c
        // a + b + c 
        double a = 100 * L / 3;

        System.out.println(a*a*a/100/100/100);
    }
}