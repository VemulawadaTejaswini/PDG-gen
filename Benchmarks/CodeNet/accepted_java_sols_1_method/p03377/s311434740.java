import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        if (x >= a && x < a + b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        } 
    }
}
