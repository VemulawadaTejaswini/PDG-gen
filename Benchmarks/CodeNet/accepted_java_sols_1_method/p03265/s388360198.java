import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int x = x2 - x1;
        int y = y2 - y1;
        System.out.println(String.format("%d %d %d %d", x2-y, y2+x, x1-y, y1+x));
    }
}