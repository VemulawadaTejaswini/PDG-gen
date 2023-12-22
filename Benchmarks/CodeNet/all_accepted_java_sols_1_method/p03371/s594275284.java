import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if (a + b <= c*2) {
            System.out.println(a*x+b*y);
            return;
        }
        
        int tmp = Math.min(x,y);
        
        int tmp2 = c * tmp * 2;
        
        int tmp3 = a * (x-tmp);
        int tmp4 = b * (y-tmp);
        
        int tmp5 = Math.max(x,y) * c * 2;
        
        int ans = Math.min(tmp5, tmp2+tmp3+tmp4);
        
        System.out.println(ans);
    }
}