import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float H = sc.nextFloat();
        float M = sc.nextFloat();
        float H_pos = H/12 + M/720;
        float M_pos = M/60;
        System.out.println(String.format("%.9f",Math.sqrt(A*A+B*B-2*A*B*Math.abs(Math.cos(Math.toRadians(360*Math.abs(H_pos-M_pos)))))));
    }
}