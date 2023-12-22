import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next(), b = sc.next(), c = sc.next();
        int ans  = 0;

        for(int i = 0; i < n; i++){
            char x = a.charAt(i);
            char y = b.charAt(i);
            char z = c.charAt(i);

            if(x == y && y == z) continue;
            else if(x == y || y == z || z == x) ans++;
            else ans += 2;
        }
        System.out.println(ans);
    }
}