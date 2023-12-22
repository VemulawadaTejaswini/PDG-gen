import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();
        long min = Long.MAX_VALUE;
        for (long i = L; i < R; i++) {
            for (long j = L+1; j <= R; j++) {
                long num = (i*j)%2019;
                if (num < min) {
                    min = num;
                } else if (num == 0) {
                    System.out.println(0);
                    return;
                }
            }
        }
        System.out.println(min);
    }
}