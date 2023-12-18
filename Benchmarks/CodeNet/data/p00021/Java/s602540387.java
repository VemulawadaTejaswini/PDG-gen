import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x1, x2, x3, x4, y1, y2, y3, y4;
        double factor = 100000;
        int n = scanner.nextInt();
         
        for(int i = 0; i < n; i++) {
            x1 = Math.round(scanner.nextDouble() * factor);
            y1 = Math.round(scanner.nextDouble() * factor);
            x2 = Math.round(scanner.nextDouble() * factor);
            y2 = Math.round(scanner.nextDouble() * factor);
            x3 = Math.round(scanner.nextDouble() * factor);
            y3 = Math.round(scanner.nextDouble() * factor);
            x4 = Math.round(scanner.nextDouble() * factor);
            y4 = Math.round(scanner.nextDouble() * factor);
         
            long v1_x, v1_y, v2_x, v2_y;
            v1_x = x2 - x1;
            v1_y = y2 - y1;
            v2_x = x4 - x3;
            v2_y = y4 - y3;
            long op = v1_x * v2_y - v1_y * v2_x;
             
            if (op == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}