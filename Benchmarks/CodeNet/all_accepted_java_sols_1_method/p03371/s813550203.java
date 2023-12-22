import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;
        if(a + b <= c*2){
            ans = a*x + b*y;
        }else{
            if(x >= y){
                ans = Math.min(a*(x-y) + 2*c*y, 2*c*x);
            }else{
                ans = Math.min(b*(y-x) + 2*c*x,2*c*y);
            }
        }
        System.out.println(ans);
    }
}
