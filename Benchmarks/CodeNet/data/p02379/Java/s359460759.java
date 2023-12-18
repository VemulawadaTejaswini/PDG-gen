import static java.lang.System.out;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double ans = Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
        out.println(String.format("%.7s", String.valueOf(ans)));                
    }
}