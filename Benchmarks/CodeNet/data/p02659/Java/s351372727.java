import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B = sc.nextDouble();
        System.out.println(((A * (B*100 + 0.5))/100));
//        System.out.println(A * B);
    }
}