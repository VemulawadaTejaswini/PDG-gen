import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        if (x - a > b || a > x) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}

