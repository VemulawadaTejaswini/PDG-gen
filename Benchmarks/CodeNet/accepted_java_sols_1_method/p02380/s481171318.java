import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
 
        System.out.println(a * b / 2 * Math.sin(Math.toRadians(c)));
        System.out.println(a
                + b
                + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b
                        * Math.cos(Math.toRadians(c))));
        System.out.println(b * Math.sin(Math.toRadians(c)));
    }
}
