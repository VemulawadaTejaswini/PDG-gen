import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), ans = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            ans += Math.min(k - a, a) * 2;
        }
        System.out.print(ans);
    }
}