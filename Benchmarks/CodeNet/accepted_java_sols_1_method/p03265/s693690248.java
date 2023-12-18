import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int dx = x2 - x1;
        int dy = y2 - y1;
        System.out.print(x2 - dy);
        System.out.print(" ");
        System.out.print(y2 + dx);
        System.out.print(" ");
        System.out.print(x1 - dy);
        System.out.print(" ");
        System.out.println(y1 + dx);
    }
}