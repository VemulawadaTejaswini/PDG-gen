import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long min = Long.MAX_VALUE;
        for(int i = 0; i < 5; i++) {
            min = Math.min(min, sc.nextLong());
        }
        double num = Math.ceil(n / (double)min);
        System.out.println((long)(num + 5 - 1));
    }
}


