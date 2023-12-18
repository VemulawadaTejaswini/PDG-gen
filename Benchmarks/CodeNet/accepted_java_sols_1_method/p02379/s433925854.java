import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x_1 = sc.nextDouble();
        double y_1 = sc.nextDouble();
        double x_2 = sc.nextDouble();
        double y_2 = sc.nextDouble();
        double d = Math.sqrt((x_2-x_1)*(x_2-x_1) + (y_2-y_1)*(y_2-y_1));
        System.out.println(d);
    }
}
