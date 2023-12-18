import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B = sc.nextDouble();
        int b = (int)Math.floor(B*100+0.5);
        System.out.println(A*(b/100)+(A*(b%100))/100);
    }
}
