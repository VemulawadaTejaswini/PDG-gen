import java.util.Scanner;

/**
 * @author : Ritchie Zhang
 * @date : 2020/5/10
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        double degree = Math.abs(30*h-5.5*m);
        if (degree>180)
        {
            degree = 360 -degree;
        }
        double hudu = degree*(Math.PI/180);
        double c = Math.sqrt(b*b+a*a-a*b*Math.cos(hudu));
        System.out.println(c);
    }
}
