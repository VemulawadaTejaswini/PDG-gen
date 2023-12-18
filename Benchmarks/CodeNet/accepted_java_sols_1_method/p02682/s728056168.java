import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner o = new Scanner(System.in);
        int a = o.nextInt();
        int b = o.nextInt();
        int c = o.nextInt();
        int k = o.nextInt();

        int ans = 0;
        ans += Math.min(k,a);
        k -= ans;
        a -= ans;
        int x = Math.min(k,b);
        k -= x;
        b -= x;
        int y = Math.min(k,c);
        ans -= y;

        System.out.println(ans);
    }
}