import static java.lang.System.out;
import java.util.Scanner;

class Main{
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        float x = scan.nextInt();
        float y = scan.nextInt();
        float x2 = scan.nextInt();                                              
        float y2 = scan.nextInt();
        double ans = Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
        out.println(String.format("%.7s", String.valueOf(ans)));
    }
}