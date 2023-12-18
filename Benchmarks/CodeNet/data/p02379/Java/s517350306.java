import static java.lang.System.out;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextInt();
        double y = scan.nextInt();
        double x2 = scan.nextInt();
        double y2 = scan.nextInt();
        double ans = Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
        out.println(String.format("%.7s", String.valueOf(ans)));                
    }
}