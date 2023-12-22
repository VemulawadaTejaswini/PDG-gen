import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        double mrad = 6*M;
        double hrad = (30*H) + (0.5*M);
        double angle = Math.abs(mrad - hrad);
        double C = Math.sqrt(Math.pow(A,2) + Math.pow(B,2) - 2*A*B*Math.cos(Math.toRadians(angle)));
        System.out.println(C);
    }
}
