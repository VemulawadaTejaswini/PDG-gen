import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int a = x / 3600;
        int y = x - a * 3600;
        int b = y / 60;
        int c = y - b * 60;
        System.out.println(a + ":" + b + ":" + c);
    }
}
