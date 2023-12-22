import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), X = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N ; i++){
            a[i] = sc.nextInt();
            X -= a[i];
        }
        Arrays.sort(a);
        int ans = N;
        ans += X / a[0];
        System.out.println(ans);
    }
}