import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = x2 + (-1) * (y2 - y1);
        int y3 = y2 + (x2 - x1);
        int x4 = x3 + (-1) * (x2 - x1);
        int y4 = y3 + (-1) * (y2 - y1);
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        
    }
}
