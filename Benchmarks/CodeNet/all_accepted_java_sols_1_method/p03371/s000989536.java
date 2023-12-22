import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans;
        if(a+b > 2*c) {
            if (x > y && a < 2*c) {
                ans = 2*y*c + (x-y)*a;
            } else if (y > x && b < 2*c) {
                ans = 2*x*c + (y-x)*b;
            } else {
                ans = 2*c*Math.max(x,y);
            }
        } else {
            ans = x*a + y*b;
        }
        System.out.println(ans);
    }
}
