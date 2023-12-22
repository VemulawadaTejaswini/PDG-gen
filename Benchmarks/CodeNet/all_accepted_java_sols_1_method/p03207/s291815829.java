import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int m = 0, ans = 0;
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
            m = Math.max(p[i], m);
            ans += p[i];
        }
        ans -= m/2;
        System.out.println(ans);
    }
}
