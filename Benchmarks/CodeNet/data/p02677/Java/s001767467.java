import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //切り出しする文字列
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();

        double e = (60 * H + M) * 0.5 - M * 6;
        double r=Math.sqrt(Math.pow(A,2) + Math.pow(B,2) - 2*A*B*Math.cos(Math.toRadians(e)));
        System.out.println(r);
    }
}
