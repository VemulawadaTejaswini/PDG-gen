import java.util.*;
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();

        double HR = 30 * H + M * 0.5;
        double MR = 360 / 60 * M;

        double r = Math.abs(HR - MR);
        double cos = Math.cos(Math.toRadians(r));
        double result = Math.pow(A, 2) + Math.pow(B, 2) - 2 * A * B * cos;
        result = Math.sqrt(result);
       
       
        System.out.println(result);
    }
}