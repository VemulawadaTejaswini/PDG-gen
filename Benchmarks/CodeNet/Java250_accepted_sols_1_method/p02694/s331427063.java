import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();

        int count = 1;
        long money = 100;
        while (true) {
            money *= 1.01;
            if (money >= X) {
                System.out.println(count);
                return;
            }
            count++;
        }
    }
}