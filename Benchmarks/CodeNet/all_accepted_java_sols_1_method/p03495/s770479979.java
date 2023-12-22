import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[200000];
        Arrays.fill(a, 0);
        for(int i = 0; i < n; i++)
            a[sc.nextInt()-1]++;
        Arrays.sort(a);
        int ans = 0;
        for(int i = 0; i < a.length - k; i++){
            ans += a[i];
        }
        System.out.println(ans);
    }
}