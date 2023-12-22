import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long w = in.nextLong();
        long h = in.nextLong();
        long x = in.nextLong();
        long y = in.nextLong();
        
        System.out.print((double)(w * h) / 2);

        if (x * 2 == w && y * 2 == h) {
            System.out.println(" 1");
        } else {
            System.out.println(" 0");
        }
    }
}
