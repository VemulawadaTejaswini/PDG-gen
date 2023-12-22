import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();
        if (B <= N) {
        	N = B - 1;
        }
        System.out.println(A * N / B - A * (N / B));
    }
}