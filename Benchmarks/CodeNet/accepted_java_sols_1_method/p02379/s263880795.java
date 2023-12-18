import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(" ");
        double x1 = Double.parseDouble(str[0]);
        double y1 = Double.parseDouble(str[1]);
        double x2 = Double.parseDouble(str[2]);
        double y2 = Double.parseDouble(str[3]);
        double a = x2 - x1;
        double b = y2 - y1;
        if(Math.signum(a) < -1) {
            a = -a;
        }
        if(Math.signum(b) < -1) {
            b = -b;
        }
        double ans = (double)Math.sqrt(Math.pow((a), 2) + Math.pow((b), 2));
        System.out.println(String.format("%.6f", ans));
    
    }
 }
