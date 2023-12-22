import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer A = sc.nextInt();
        Integer B = sc.nextInt();
        Integer C = sc.nextInt();
        Integer K = sc.nextInt();

        int count = K;
        int rst = 0;

        // A 
        rst += Math.min(count, A);
        count = Math.max(0, count - A);

        // B 
        count = Math.max(0, count - B);

        // C 
        rst -= Math.min(count, C);
        count = Math.max(0, count - C);

        System.out.println(rst);
    }
}