import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        double tan  = H*30 + M*0.5;
        double tyou = M*6;
        double kakdo = Math.abs(tan-tyou);
        
        double yogen = A*A + B*B - 2*A*B*Math.cos(kakdo * (Math.PI / 180));
        double sqrt_yogen = Math.sqrt(yogen);
        
        System.out.println(sqrt_yogen);
    }
}