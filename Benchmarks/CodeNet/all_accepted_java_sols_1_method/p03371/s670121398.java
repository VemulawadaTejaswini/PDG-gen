import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int xymin = Math.min(x,y);
        long ans = xymin * Math.min(a+b,c*2);
        x -= xymin;
        y -= xymin;
        if(x == 0){
            ans += y*Math.min(b,c*2);
        }else{
            ans += x*Math.min(a,c*2);
        }
        System.out.println(ans);
    }
}