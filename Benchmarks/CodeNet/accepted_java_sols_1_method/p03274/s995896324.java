import java.util.*; 
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n+1];
        for(int i = 0;  i < n; i++){
            a[i] = sc.nextInt();
        }
        long ans = Long.MAX_VALUE;
        for(int i = 0;  i+k-1 < n; i++){
            ans = Math.min(ans, Math.min(Math.abs(a[i]) + Math.abs(a[i] - a[i+k-1]), Math.abs(a[i+k-1]) + Math.abs(a[i] - a[i+k-1])));
        }
        System.out.println(ans);
    }
 }

