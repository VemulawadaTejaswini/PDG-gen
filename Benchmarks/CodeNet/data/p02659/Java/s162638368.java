import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        String b = sc.next();
        int ind = b.indexOf('.');
        String b_syo = b.substring(ind+1);
        String b_dai = b.substring(0, ind);
        int b_ = Integer.parseInt(b_syo);
        int b__ = Integer.parseInt(b_dai);

        int int_B = b__;
        double double_B = b_/100.0;

        // int int_B = (int)B;
        // double double_B = B-int_B;

        // System.out.println(int_B);
        // System.out.println(double_B);
        System.out.println(A*int_B+(long)(A*double_B));
    }
}