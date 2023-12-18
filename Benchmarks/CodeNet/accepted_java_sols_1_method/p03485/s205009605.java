import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double ave = (a + b) / 2;
        
        System.out.println(Math.round(ave));
    }
}
