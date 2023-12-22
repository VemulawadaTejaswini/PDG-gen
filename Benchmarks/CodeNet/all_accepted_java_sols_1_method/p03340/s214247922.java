import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        int s = 0;
        int t = 0;
        long ans = 0;
        int tmp;
        long sum = 0;
        long xor_sum = 0; 
        while(t <= n-1){
            if((xor_sum |+ a[t]) == sum + a[t]){
                ans += t - s + 1;
                xor_sum = xor_sum ^ a[t];
                sum += a[t];
                t++;
            }else{
                xor_sum = xor_sum ^ a[s];
                sum -= a[s];
                s++;
            }
        }
          System.out.println(ans);   
    }
}