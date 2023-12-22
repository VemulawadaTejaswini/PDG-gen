import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int out = 0;
        int a = scan.nextInt();
        int b = scan.nextInt();
        out = Math.max(a + b, a - b);
        out = Math.max(out, a * b);
        System.out.println(out);
    }
}