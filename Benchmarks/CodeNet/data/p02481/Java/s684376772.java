import java.util.Scanner;

/**
 * Main (Main.java)
 * @author tsuttsu305
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt();
        int a = x*y, b = x*2+y*2;
        System.out.println(a + " " + b);
        scan.close();
    }
}