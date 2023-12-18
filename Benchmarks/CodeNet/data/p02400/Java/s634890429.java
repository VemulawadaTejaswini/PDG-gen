import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        
        double menseki = r * r * 3.141592653589;
        double enshu = 2 * r * 3.141592653589;
        
        System.out.printf("%f %f", menseki, enshu);
    }
}

