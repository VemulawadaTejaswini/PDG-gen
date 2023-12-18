import java.util.*;
class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(((0 <= x - r) && (x + r <= w) && (0 <= y - r) && (y + r <= h)) ? "Yes" : "No");
    }
}