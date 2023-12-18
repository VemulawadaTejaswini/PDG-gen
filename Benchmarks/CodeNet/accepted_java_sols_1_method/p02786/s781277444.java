import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = Long.parseLong(sc.next());
        int n = 0;
        while (h > 0) {
            n++;
            h /= 2;
        }
        System.out.println((long)Math.pow(2, n) - 1);
    }
}
