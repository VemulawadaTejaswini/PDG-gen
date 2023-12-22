import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        int ans = 0;
        int tmp = 101;
        for(int i = 1; i < n; i++){
            if(a[i] == a[i-1]){
                a[i] = ++tmp;
                ans++;
            }
        }
        System.out.print(ans);
    }
}