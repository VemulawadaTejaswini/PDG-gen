import org.w3c.dom.ls.LSOutput;
import java.util.*;
public class Main {
    static boolean visited[] = new boolean[1002];
    static boolean counted[] = new boolean[1002];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n >= 400 && n < 600) {
            count = 8;
        }
        if (n >= 600 && n < 800) {
            count = 7;
        }
        if (n >= 800 && n < 1000) {
            count = 6;
        }
        if (n >= 1000 && n < 1200) {
            count = 5;
        }
        if (n >= 1200 && n < 1400) {
            count = 4;
        }
        if (n >= 1400 && n < 1600) {
            count = 3;
        }
        if (n >= 1600 && n < 1800) {
            count = 2;
        }
        if (n >= 1800 && n < 2000) {
            count = 1;
        }
        System.out.println(count);
    }
}




