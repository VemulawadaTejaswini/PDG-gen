import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int r = scanner.nextInt();

        int a = p+q;
        int b = p+r;
        int c = r+q;
        
        int min1 = Math.min(a, b);
        min1 = Math.min(c, min1);
        System.out.println(min1);
    }
}