import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        int i = 2;
        while (true) {
            if (i == x) {
                System.out.println(i);
                return;
            }
            if (x % i == 0) {
                x++;
                i = 2;
                continue;
            } else {
                i++;
            }
        }
    }
}
