import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        a[0] = sc.nextInt();
        for(int i = 1; i < n; i++) a[i] = a[i-1] + sc.nextInt();
        b[0] = sc.nextInt();
        for(int i = 1; i < n; i++) b[i] = b[i-1] + sc.nextInt();
        int ans = a[0] + b[n-1];
        for(int i = 1; i < n; i++)
            ans = Math.max(ans, a[i] + b[n-1] - b[i-1]);
        System.out.println(ans);
    }
}