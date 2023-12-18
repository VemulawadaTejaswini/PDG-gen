import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();
        int dis = (int)Math.abs(a - b);
        long speed = v - w;
        if((long)(t * speed) >= dis)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}