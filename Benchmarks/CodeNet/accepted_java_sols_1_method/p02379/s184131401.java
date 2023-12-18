
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x = x2-x1;
        double y = y2-y1;
        System.out.printf("%f",Math.sqrt((x*x)+(y*y)));
    }
}

