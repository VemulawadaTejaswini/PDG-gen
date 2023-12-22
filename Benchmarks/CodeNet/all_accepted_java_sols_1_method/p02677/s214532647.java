import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        double rad;
        double ans;

        rad = (double)((h*30)-(m*5.5));
        rad *= (rad<=0)?-1:1;
        rad = (rad>=180)?360-rad:rad;

        ans = (a*a)+(b*b)-((2*a*b)*(Math.cos(Math.toRadians(rad))));
        ans = Math.sqrt(ans);

        System.out.println(ans);

    }
}
