import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
        int ans = 0;
        int[] a = new int[25];
        int cnt4 = 0, cnt2 = 0, cnt24 = 0, cnt14 = 0, cnt74 = 0;
        for(int k = 2; k <= n; k++){
            int i = k;
            for(int j = 0; j < 25; j++){
                while(i > 1 && i % p[j] == 0){
                    a[j]++;
                    i = i / p[j];
                }
            }
        }
        for(int i = 0; i < p.length; i++){
            if(a[i] >= 4) cnt4++;
            if(a[i] >= 2) cnt2++;
            if(a[i] >= 14) cnt14++;
            if(a[i] >= 24) cnt24++;
            if(a[i] >= 74) cnt74++;
        }
        ans = cnt4 * (cnt4 - 1) * (cnt2 - 2) / 2 + cnt24 * (cnt2 - 1) + cnt74 + cnt14 * (cnt4 - 1);
        System.out.println(ans);
    }
} 