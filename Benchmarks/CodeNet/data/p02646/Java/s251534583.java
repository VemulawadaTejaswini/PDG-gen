import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();

        int lcm = lcm(v, w);

        if(w >= v){
            System.out.println("NO");
            return;
        }
        if(Math.abs(a - b) <= (v - w) * t){
            System.out.println("YES");
            return;
        }

        System.out.println("NO");

    }

}
