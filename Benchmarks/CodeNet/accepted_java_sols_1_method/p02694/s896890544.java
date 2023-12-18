import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long target = sc.nextLong();
        long balance = 100;
        int year = 0;

        for (;;) {
            year++;
            balance += balance * 0.01;
            if (balance >= target) {
                System.out.println(year);
                System.exit(0);
            }
        }
    }
}