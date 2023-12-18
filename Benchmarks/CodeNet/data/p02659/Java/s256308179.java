import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B = sc.nextDouble();
        int b = 0;
        for (int i=0;i<2000;i++) {
            if (i<=B*100) b = i;
        }
        // int b = (int)Math.floor(B*100);
        System.out.println(A*(b/100)+(A*(b%100))/100);
    }
}