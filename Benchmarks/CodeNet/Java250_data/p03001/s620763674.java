import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong();
        long h = sc.nextLong();
        double x = sc.nextLong();
        double y = sc.nextLong();
        double midx = w / 2.0;
        double midy = h / 2.0;
        System.out.println(w * h / 2.0);
        if(midx == x && midy == y) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}