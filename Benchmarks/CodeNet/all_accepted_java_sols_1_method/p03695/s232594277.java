import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[9];
        for(int i = 0; i < n; i++){
            int k = sc.nextInt() / 400;
            if(k > 8) k = 8;
            a[k]++;
        }
        int ans1 = 0;
        for(int i = 0; i < 8; i++)
            if(a[i] > 0) ans1++;
        int ans2;
        if(ans1 == 0){
            ans1 = 1;
            ans2 = a[8];
        }else
            ans2 = ans1 + a[8];
        System.out.print(ans1 + " " + ans2);
    }
}