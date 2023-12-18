import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B = sc.nextDouble();
        sc.close();
        System.out.println(Math.round(Math.floor(A*B)));
    }
}
