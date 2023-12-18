import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A=scan.nextInt();
        int B=scan.nextInt();
        int H=scan.nextInt();
        int M=scan.nextInt();
        double AB=Math.pow(A,2)+Math.pow(B,2);
        double res=Math.sqrt(AB);
        System.out.println(res);
    }
}
