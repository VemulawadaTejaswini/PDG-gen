import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long a = 100l;
        for (int i = 0 ; i < 100000 ; i++) {
            a *= 1.01;
            if (a >= x) {
                System.out.println(i + 1);
                return;
            }
        }
    }

}