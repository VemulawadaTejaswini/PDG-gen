import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B = sc.nextDouble();
        int int_B = (int)B;
        double double_B = B-int_B;

        System.out.println(A*int_B+(long)(A*double_B));
    }
}