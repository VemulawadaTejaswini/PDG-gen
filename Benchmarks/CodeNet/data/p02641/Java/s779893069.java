import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(4 * x >= y && (4 * x - y) % 2 == 0 && (4 * x - y) / 2 <= x) {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}