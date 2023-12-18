import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        int c = 0;
        while (x <= y) {
            x *= (long) 2;
            c++;
        }
        System.out.println(c);
    }

}
