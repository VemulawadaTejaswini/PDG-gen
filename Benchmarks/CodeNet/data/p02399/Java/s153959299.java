import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        DecimalFormat df = new DecimalFormat(".00000000");
        int d = a / b;
        int r = a % b;
        double ad = a;
        double bd = b;
        double f = ad / bd;
        System.out.print(d + " ");
        System.out.print(r + " ");
        System.out.println(df.format(f));
    }
}
