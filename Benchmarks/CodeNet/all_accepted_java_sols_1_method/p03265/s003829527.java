import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1, x2, x3, x4, y1, y2, y3, y4;
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        x2 = scan.nextInt();
        y2 = scan.nextInt();
        
        x3 = x2 - (y2 - y1);
        y3 = y2 - (x1 - x2);
        x4 = x1 - (y2 - y1);
        y4 = y1 - (x1 - x2);
        
        System.out.println(String.format("%d %d %d %d", x3, y3, x4, y4));
        scan.close();
    }
}
