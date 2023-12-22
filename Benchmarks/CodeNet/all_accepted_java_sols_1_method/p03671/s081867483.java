import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int v1 = a + b;
        int v2 = a + c;
        int v3 = c + b;
        System.out.println(Math.min(Math.min(v1, v2), v3));
    }
}
