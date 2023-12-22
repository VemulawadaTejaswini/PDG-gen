import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        long h = Long.parseLong(scan.next());
        long num = 1;
        long count = 0;
        while (h > 0) {
            h = h/2;
            count = count + num;
            num *= 2;
        }
        System.out.println(count);
    }
}